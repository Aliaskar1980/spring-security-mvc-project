select * from users;
insert into users( name , password, age)
values ('user','user', 20),
       ('admin','admin',30);


select * from roles;
insert into roles (role)
values ('ROLE_USER'),
       ('ROLE_ADMIN');

select * from user_role;
insert into user_role(user_id,role_id)
values (1,1),
       (2,2);