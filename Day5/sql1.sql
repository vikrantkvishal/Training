show databases;

create database IF NOT EXISTS mindsprint;

use mindsprint;

create table EMP (
	id int primary key,
    name varchar(100),
    dept varchar(20),
    sal decimal(8,2)
);

alter table EMP add column position varchar(100);

insert into EMP values(1,"AA","IT",234567,"Junior Developer");

select * from EMP;

insert into EMP (id,position,dept,sal,name)
	values(2,'Senior Developer','IT',345679,'BB');
    
insert into EMP (id,position,dept,sal,name)
	values(3,'Full Stack Developer','IT',98765,'CC'),
    (4,'Full Stack Developer','IT',947562,'CC');
    
update EMP set sal = 234567 where id = 3;

delete from EMP where id = 4;

truncate table EMP ;

drop table EMP;

create table EMPS (
	id int primary key auto_increment,
    name varchar(100),
    dept varchar(20),
    pos varchar(100),
    sal decimal(8,2)
);

desc EMPS;

insert into EMPS values(null,"AA","IT","Junior Developer",234567);

select * from EMPS;

insert into EMPS (pos,dept,sal,name)
	values('Full Stack Developer','IT',98765,'CC'),
    ('Senior Developer','IT',345679,'BB'),
    ('Full Stack Developer','IT',947562,'DD');
    
select now();

select 1+1 as sum;

select now() today;

select lower(name) from EMPS;

select * from EMPS;

select * from EMPS where sal>=100000;

select * from EMPS where id = 4;

select * from EMPS where name='AA';

select * from EMPS where sal between 100000 and 300000;

select * from EMPS order by sal;

select * from EMPS order by name desc;

select * from EMPS order by sal,name desc;

select * from EMPS order by pos;

select * from EMPS order by pos,name desc,sal;

select * from EMPS order by sal desc limit 1;

select distinct dept from EMPS;

select * from EMPS where pos like '%dev%';


