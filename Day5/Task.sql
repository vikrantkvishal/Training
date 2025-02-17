use employees;

show tables;

select * from employees;
select * from titles;
select * from departments;
select * from dept_emp;
select * from salaries;
select * from dept_manager;
select * from current_dept_emp;
select * from dept_emp_latest_date;

select e.first_name,e.last_name,t.title from employees e join titles t on e.emp_no = t.emp_no;

select e.emp_no,e.birth_date,e.first_name,e.last_name,e.gender,e.hire_date 
from employees e 
join dept_emp de 
on e.emp_no =  de.emp_no
join departments d
on de.dept_no = d.dept_no
where dept_name = 'Sales';

select avg(s.salary) 
from employees e 
join salaries s
on e.emp_no = s.emp_no;

select d.dept_no,de.dept_name,count(*) 
from employees e
join dept_emp d
on e.emp_no = d.emp_no
join departments de
on d.dept_no = de.dept_no
group by d.dept_no;

select count(*) from employees;

select d.dept_no,de.dept_name
from dept_emp d
join departments de
on d.dept_no = de.dept_no
group by d.dept_no
having count(*) > 5;

select e.first_name, e.last_name
from employees e
join dept_emp de on e.emp_no = de.emp_no
join departments d on de.dept_no = d.dept_no
where d.dept_name in ('Marketing', 'Finance');

select gender, COUNT(*) "No. of Employees"
from employees
group by gender
order by `No. of Employees` desc;

select t.title, avg(s.salary) "Average Salary"
from titles t
join salaries s on t.emp_no = s.emp_no
group by t.title
order by `Average Salary` desc;

select e.emp_no, e.first_name, e.last_name, d.dept_name
from employees e
join dept_emp de on e.emp_no = de.emp_no
join departments d on de.dept_no = d.dept_no
limit 5;

select e.first_name, e.last_name, s.salary
from employees e
join salaries s on e.emp_no = s.emp_no
order by s.salary desc
limit 1;

select e.first_name, e.last_name, s.salary
from employees e
join salaries s ON e.emp_no = s.emp_no
order by s.salary desc
limit 1 offset 1;