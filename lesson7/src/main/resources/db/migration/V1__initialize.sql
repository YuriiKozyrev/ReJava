drop table if exists students cascade;
create table students (id bigserial, name varchar(255), age int, primary key(id));
insert into students
(name, age) values
('Mike', 20),
('John', 19),
('Nina', 21);