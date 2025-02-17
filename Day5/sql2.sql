Create table Students(
stu_id INT Primary Key,
name VARCHAR(100),
age int,
major VARCHAR(50),
gpa decimal(5,2),
enroll_date date
);

INSERT INTO Students (stu_id, name, age, major, gpa, enroll_date)
VALUES
(101, 'Alice Johnson', 20, 'Computer Science', 3.8, '2023-01-15'),
(102, 'Bob Smith', 22, 'Mathematics', 3.4, '2023-03-22'),
(103, 'Carol Lee', 19, 'Biology', 3.2, '2023-04-10'),
(104, 'David Brown', 21, 'Physics', 2.9, '2022-11-05'),
(105, 'Eve Davis', 23, 'Computer Science', 3.6, '2022-08-20'),
(106, 'Frank Miller', 20, 'Mathematics', 3.1, '2023-02-28');
drop table Students;
select * from Students;

-- Select all students who are majoring in "Computer Science"
select * from Students where major = 'Computer Science';

-- Select students with a GPA greater than 3.5 or who are majoring in "Mathematics"
select * from Students where gpa > 3.5 and major = 'Mathematics';

-- Select students who are older than 20 and have a GPA less than 3.0
select * from Students where age>20 and gpa<3.0;

-- Select students who enrolled between January 1, 2023 and December 31, 2023
select * from Students where enroll_date between 2023-01-01 and 2023-12-31;

-- Select distinct majors from the Studentes table
select distinct major from Students;

-- Select students with IDs in the list(101,102,103)
select * from Students where stu_id in (101,102,103);

-- Select students where the GPA is NULL (if applicable)
select * from Students where gpa is NULL;

-- Select students where the name is not NULL
select * from Students where name is NOT NULL;

-- Select Students where age is exactly 18 or 22
select * from Students where age = 18 or age = 22;

-- Select students who are either less than 19 years old or have a GPA greater than 3.8
select * from Students where age<19 or gpa>3.8;

-- Select students who have a GPA between 2.5 and 3.5 and are majoring in "Biology"
select * from Students where gpa between 2.5 and 3.5 and major = 'Biology';

-- Select students and order them by name in ascending order and then by GPA in descending order
select * from Students order by name , gpa desc;

