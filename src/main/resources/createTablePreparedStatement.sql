CREATE TABLE dish
(
  id int PRIMARY KEY NOT NULL,
  title varchar(45),
  description varchar(100),
  rating double,
  published tinyint,
  created date,
  icon longblob
);