create database sample;
use sample;
 
create table dept(id int primary key,name varchar(100) not null);

insert into dept values
(1,'Sales'),
(2,'R&D'),
(3,'Marketing'),
(4,'Finance'),
(5,'Human Resources');

select * from dept;

create table emp (
id int primary key,
name varchar(100) not null,
position varchar(100) not null,
salary decimal(10,2),
dept_id int,
foreign key (dept_id) references dept(id)
);

INSERT INTO emp (id, name, position, salary, dept_id) VALUES
(1, 'John Doe', 'Manager', 75000.00, '1'),
(2, 'Jane Smith', 'Developer', 65000.00, '2'),
(3, 'Emily Johnson', 'Designer', 60000.00, '3'),
(4, 'Michael Brown', 'Analyst', 70000.00, '4'),
(5, 'Linda Green', 'Manager', 75000.00, '1'),
(6, 'James White', 'Developer', 65000.00, '2');

select * from emp;
select * from dept;

select e.id,e.name,e.position,e.salary,d.name from emp e join dept d on e.dept_id = d.id;

insert into emp values
(9,"John Doe","developer",1000000,null);
 
-- left join
select e.id, e.name, e.position,d.name as dep from emp as e left join dept as d on e.dept_id = d.id;
 
insert into dept values
(9,"developer");
 
-- right join
select e.id, e.name, e.position,d.name as dep from emp as e right join dept as d on e.dept_id = d.id;

-- full outer join
select e.id, e.name, e.position,d.name as dep from emp as e left join dept as d on e.dept_id = d.id
union
select e.id, e.name, e.position,d.name as dep from emp as e right join dept as d on e.dept_id = d.id;

-- cross join
select e.id EmployeeID, e.name EmployeeName, d.id DepartmentId,d.name DepartmentName from emp e cross join dept d;

-- group by
select count(*) "No.of Employees",dept_id Department from emp group by dept_id;

select d.name "Department Name",count(*) "Total no. of Employees" from emp e join dept d on e.dept_id = d.id group by d.name;

select d.name "Department Name",count(*) "Total no. of Employees",sum(salary) "Total Sum of Salary" from emp e join dept d on e.dept_id = d.id group by d.name having `Total Sum of Salary` > 100000;

select d.name "Department Name",count(*) "Total no. of Employees",sum(salary) "Total Sum of Salary" from emp e join dept d on e.dept_id = d.id group by d.name having `Total no. of Employees` > 1;

select d.name Department, SUM(e.salary) "Total Salary"
from emp e
join dept d 
on e.dept_id = d.id
group by d.name with rollup;



select * from emp;
select * from dept;


CREATE TABLE Accounts (
 acc_id VARCHAR(10) PRIMARY KEY,
 acc_name VARCHAR(100),
 bal DECIMAL(10, 2)
);

INSERT INTO Accounts (acc_id, acc_name, bal) 
VALUES
('A001', 'Alice', 1000.00),
('A002', 'Bob', 1500.00),
('A003', 'Charlie', 2000.00);

begin;
update Accounts set bal = bal + 100 where acc_id = 'A001';
update Accounts set bal = bal + 100 where acc_id = 'A001';
commit;

begin;
update Accounts set bal = bal + 100 where acc_id = 'A001';
update Accounts set bal = bal + 100 where acc_id = 'A001';
rollback;
commit;

BEGIN ;
UPDATE Accounts SET balance = balance - 100 WHERE account_id = 1;
SAVEPOINT sp1;
UPDATE Accounts SET balance = balance + 100 WHERE account_id = 2;
ROLLBACK TO sp1;
COMMIT;

select * from Accounts;

Delimiter //

create procedure getAllAccounts()
begin
	select * from Accounts;
end //

Delimiter ;

call getAllAccounts();



