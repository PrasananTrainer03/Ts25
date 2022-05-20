-- String Functions

-- instr() : Used to display the first occurrence of given char. 

select instr('Thanusha','a');

select Ename,instr(Ename,'A') from Emp;

-- Reverse() : used to display string in reverse order 

select reverse('Thanusha');

select Ename, Reverse(Ename) from Emp;

-- Length() : used to display the length of given string 

select Ename, length(ename) from Emp;

select length('Thanusha Chinthala') ;

-- LEFT : Dispalys no.of left side chars

-- Right : Displays no.of right side chars

select left('Thanusha Chinthala',5);

select right('Thanusha Chintala',5);

-- Lower : used to display in lower case

-- Upper : Used to display in upper case 

select Ename, lower(ename), Upper(ename) from Emp;

select 'Thanusha',lower('Thansuha'),upper('Thanusha') ;

-- Concat : Used to concatenate multiple strings. 

select concat('Tejesh',' ', 'Jasthi');

-- Replace() : Used to replace old value with new value in all occurrences 

select replace('Java Training','Java','Sql');

-- Substr() : used to display the part of the string 

select substr('welcome to mysql programming',5,10);