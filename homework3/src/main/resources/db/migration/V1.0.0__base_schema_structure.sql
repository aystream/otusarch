create sequence user_seq;

create table users (
     id                 bigint       not null
        constraint users_pkey
            primary key,
    user_name varchar(1024),
    first_name varchar(1024),
    last_name varchar(1024),
    phone varchar(100),
    email varchar(1024)
);
