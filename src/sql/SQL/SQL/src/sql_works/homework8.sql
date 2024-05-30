-- Homework 8

--Let's create a table named employee in your test database with column information id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100).
CREATE TABLE employee (
	id SERIAL PRIMARY KEY,
	name VARCHAR(50) NOT NULL,
	birthday DATE,
	email VARCHAR(100));

-- Let's add 50 data to the employee table we created using the 'Mockaroo' service.
insert into employee (name, email, birthday) values ('Táng', 'eholwell0@4shared.com', '1979/09/02');
insert into employee (name, email, birthday) values ('Tán', 'llandes1@wordpress.com', '1909/09/06');
insert into employee (name, email, birthday) values ('Märta', 'gbollum2@usatoday.com', '1958/08/16');
insert into employee (name, email, birthday) values ('Josée', 'ndossantos3@state.gov', '1937/08/28');
insert into employee (name, email, birthday) values ('Nadège', 'msarle4@nba.com', '1961/12/14');
insert into employee (name, email, birthday) values ('Kuí', 'thinemoor5@census.gov', '1941/05/08');
insert into employee (name, email, birthday) values ('Judicaël', 'wmarusik6@mit.edu', '1926/12/27');
insert into employee (name, email, birthday) values ('Miléna', 'mtootal7@jugem.jp', '1941/11/27');
insert into employee (name, email, birthday) values ('Måns', 'ctift8@istockphoto.com', '2007/03/28');
insert into employee (name, email, birthday) values ('Danièle', 'adiemer9@psu.edu', '1976/01/19');
...
...


-- Let's perform 5 UPDATE operations that will update the other columns according to each row.
UPDATE employee
SET name = 'XXYY',
	birthday = '1999-08-09',
	email = 'XXYY@gmail.com'
WHERE id <= 5;

-- Let's perform 5 DELETE operations for each row, which will delete the relevant row.
DELETE FROM employee
WHERE id IN(10,20,30,40,45);

