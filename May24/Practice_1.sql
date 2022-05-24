drop database if exists tb25practice;

create database tb25practice;

use tb25practice;

drop table if exists employ;

/* *****************************************************************************
					Creating Employ Table
   ***********************************************************************************
*/
create table employ
(
	Empno int primary key,
     Name varchar(30),
     Gender ENUM('MALE','FEMALE'),
     Dept varchar(30),
     Desig varchar(30),
     Basic numeric(9,2)
);

/* **************************************************************************************
					Inserting Data into Employ table 
   **************************************************************************************
*/
Insert into Employ(Empno,Name,Gender,Dept,Desig,Basic) values(1,'Pavan','MALE','Mysql','Developer',94234),
			(2,'Rohit','FEMALE','Java','Programmer',95344),
            (3,'Rupaswi','FEMALE','Mysql','Developer',99234),
            (4,'Tejesh','MALE', 'Java','Developer',93344),
            (5,'Karthik','MALE', 'Mysql','Expert',93244); 
            
select * from Employ;            