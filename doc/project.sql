drop table if exists test;
create table test (
    id bigint not null,
    name varchar(50),
    password varchar(50),
    primary key (id)
) engine=innodb default charset=utf8mb4;

insert into test (id, name, password) values (1, 'xyp', '123456');
insert into test (id, name, password) values (2, 'lj', '654321');