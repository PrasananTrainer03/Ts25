use tr25;
-- To see list of table 

show tables ;

-- To see the structure of the given table  (desc table_name) 

Desc Emp;

-- To see the list of records available in the current database 

select * from Emp;

-- Display Empno, Ename, Job, Sal from Emp table 

select empno, ename, job,sal
from Emp ;

-- Where Clause : Used to filter the given records 

-- Display all records whose sal <= 3000;

select * from Emp WHERE
sal  <= 3000;

-- Display all records whose Job is 'CLERK' 

select * from Emp Where 
JOB='CLERK';

-- BETWEEN...AND : Used to display values from Start to end range 

select * from Emp where sal between 1000 and 3000;

select * from Emp where sal not between 1000 and 3000;

-- IN Clause : Used to display values for multiple values of particular column 

select * from Emp where job in('CLERK','MANAGER');

select * from Emp where ENAME IN('SMITH','BLAKE');

select * from Emp where JOB NOT IN('CLERK','MANGER');

select * from Emp where ENAME NOT IN('SMITH','BLAKE');

-- LIKE Operator : Used to display data w.r.t. Wild cards 

select * from Emp where ename like 'S%';

select * from Emp where ename like '%S'; 

select * from Emp where Ename LIKE 'J___S';

-- Order By : Used to display data w.r.t. Specific field(s) in ascending or descending order 

select Empno,Ename,JOB,Sal,Mgr from Emp 
order By Sal;

select Empno,Ename,Job,Sal,Mgr from Emp
order by sal desc;

select Empno,Ename,Job,Sal,Mgr from Emp
order by Job,Ename;