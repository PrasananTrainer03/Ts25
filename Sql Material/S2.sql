-- String functions

-- Instr() : Used to display the first occurrence of given char. 

select instr('bhagyasree','a');

select Ename, Instr(Ename,'A') from Emp;

-- length() : display's length of given string 

select length('bhagyasree');

select ename,length(Ename) from Emp;

-- Reverse() : Used to display string in reverse order 

select reverse('Bhagyasree');

select ename, reverse(ename) from Emp;

-- left() : Display's no.of left-side chars

-- right() : Display's no.of right-side chars

select Ename, left(Ename,4), right(ename,4) from Emp;

-- Lower() : Displays in lower case

-- Upper() : Displays in upper case 

select ename,lower(ename),Upper(Ename) from Emp;

-- concat() : Used to join one or more strings 

select concat('Sekhar',' ','Paravada');

-- replace() : used to replace old value with new value in all occurrences 

select replace('Java Training','Java','Dotnet');

-- substr() : Displays the part of the string 

select substr('Welcome to MySql',4,10);
