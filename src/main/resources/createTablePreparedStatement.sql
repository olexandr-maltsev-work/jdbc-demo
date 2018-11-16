create table dish
(
  id          int          not null
    primary key,
  title       varchar(45)  null,
  description varchar(100) null,
  rating      double       null,
  published   tinyint      null,
  created     date         null,
  icon        longblob     null
);

