BEGIN;


DROP TABLE IF EXISTS students CASCADE;
CREATE TABLE students (id bigserial PRIMARY KEY, name VARCHAR(255), mark int);
INSERT INTO students (name, mark) VALUES
('Ivan', 5),
('Marya', 5);

COMMIT;