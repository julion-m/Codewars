select * from users where age >= 18
-- sucht alle Benutzer aus einer Datenbank raus, die mind. 18 sind

-- https://www.codewars.com/kata/on-the-canadian-border-sql-for-beginners-number-2/train/sql
-- gib alle Traveller aus, die nicht aus den USA, Mexico oder Canada kommen
select * from travelers where country <> USA, Mexico, Canada

