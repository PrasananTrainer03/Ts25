-- Date Functions 

select curdate();

select curtime();

select dayofweek(curdate());

select dayofmonth(curdate());

select quarter(curdate());

select Year(curdate());

-- last_day() : Displays the last day of the month specified

select last_day(curdate());

select adddate(curdate(),INTERVAL 5 day); 

select adddate(curdate(), INTERVAL 3 MONTH);

select adddate(curdate(), INTERVAL 3 YEAR);

