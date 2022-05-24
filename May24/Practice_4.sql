use tb25practice;

drop table if exists test;
create table Test
(
   empno int,
   name varchar(30),
   basic numeric(9,2)
);

alter table Test add gender ENUM('MALE','FEMALE');

alter table Test add Dept varchar(30);

alter table Test add constraint primary key(Empno);

-- modify the name column size as 20 chars

alter table test modify Name varchar(20);

-- Remove the Column gender from Test table 

alter table test drop column Gender;

desc Test;