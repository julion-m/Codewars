--https://www.codewars.com/collections/sql-for-beginners
--katas from this collection

--#1
select * from users where age >= 18;
-- sucht alle Benutzer aus einer Datenbank raus, die mind. 18 sind

--#2
-- gib alle Traveller aus, die nicht aus den USA, Mexico oder Canada kommen
select *
from travelers
where country <> 'USA'
and country <> 'Mexico'
and country <> 'Canada';

--einfacher / best practice
Select name,country
from travelers
where country
        not in ('Canada','Mexico','USA');

--#3
-- neuen Datensatz einfügen und ausgeben lassen
insert into participants (name, age, attending)
  values ('Julian', '21', 'true');

select * from participants;

--#4
select *
from students
where tuition_received= 'false';

--#5
select *
from books
order by copies_sold DESC
limit 5;

alter table decimals
add result int
