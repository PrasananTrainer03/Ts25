-- Change to Tb5 database 

use Tb5;

-- Display list of tables available in the current database 

show tables;

-- Display inforamtion about Emp Table 

Desc Emp;

-- Display information about Dept Table 

Desc Dept;

-- Display all records from Emp table 

select * from Emp;

-- Display Empno,Ename,job,sal from Emp table 

select Empno, Ename, Job, Sal
from Emp ;

-- Project Operator used to project particular field(s) 

-- Where Clause : Used to display only the filtered records 

-- Display all records whose sal >= 2000

select * from Emp
where sal >= 2000;

-- Display all records whose Job is 'Manager' 

select * from Emp 
where Job='Manager';

-- Display information whose EName is 'king'

select * from Emp 
where ename='KING';

-- Between...AND : used to display values from start to end range 

select * from Emp where sal between 1250 and 3000;

select * from Emp where sal not between 1000 and 2000;

-- Display all records for which comm is null

select * from Emp where comm is null;

-- Display all records which mgr is null 

select * from Emp where mgr is null;

-- IN Clause : Used to display values for multiple values of particular column 

-- Display information from Emp table, whose Ename is KING/SCOTT/ADAMS 

select * from Emp where ENAME IN('SCOTT','KING','ADAMS');

-- Display information from Emp table, whose job is 'CLERK/MANAGER/SALESMAN' 

select * from Emp where Job IN('CLERK','MANAGER','SALESMAN');

select * from Emp where JOB NOT IN('CLERK','MANAGER','SALESMAN');

-- LIKE : Used to display data w.r.t. Wildcards 

-- Display all records whose name Starts  with 'S'

select * from Emp where ename like 'S%';

-- Display all records whose name ends with 'S' 

select * from Emp where ename like '%s';

-- Dispaly information whose name starts J and 5th char is S, 

select * from Emp where Ename LIKE 'J___S';

-- Order By : Used to displa values w.r.t. Specific field(s) in ascending or descending order 

select empno,ename,job,sal,mgr from Emp 
order by sal;

select empno,ename,job,sal,mgr from Emp
order by sal desc;

select empno,ename,job,sal,mgr from emp
order by job,ename;

-- Distinct : Used to display unique values in select command (eliminate duplicates at the time 
		-- of display)

select job from Emp;

select distinct job from Emp;

