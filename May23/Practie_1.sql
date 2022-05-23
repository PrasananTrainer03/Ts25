-- Group By Clause 

select job, sum(sal) from EMp
group by job;

select job, count(*) from Emp 
group by job;

-- Display max,min,avg,count from emp table based on job wise

select job, sum(sal), avg(sal),max(sal),min(sal),count(*)
from EMp group by job;


select job, sum(sal) 
from Emp group by job
having sum(sal) >= 5000;

select job,count(*) from Emp
group by job
having count(*) > 1;

