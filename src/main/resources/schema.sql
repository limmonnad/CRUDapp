create table if NOT EXISTS STUDENTS
(
    id         long auto_increment primary key,
    first_name varchar(255) not null,
    last_name  varchar(255) not null,
    email      varchar(255) not null,
    dob        date         not null
);
