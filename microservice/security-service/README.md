# USer Table
```mysql

CREATE TABLE `user_credential` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `active` tinyint(1) NOT NULL,
  `password` varchar(255) NOT NULL,
  `user_id` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_14ncv1m0gqncrbiagrs4uaqo8` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

CREATE TABLE `user_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) NOT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `phone` varchar(255) NOT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  `billing_address_id` bigint(20) DEFAULT NULL,
  `shipping_address_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_hixwjgx0ynne0cq4tqvoawoda` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

CREATE TABLE `user_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role` varchar(255) DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_apcc8lxk2xnug8377fatvbn04` (`user_id`),
  CONSTRAINT `FK_apcc8lxk2xnug8377fatvbn04` FOREIGN KEY (`user_id`) REFERENCES `user_credential` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;


```
# Data
```mysql

insert into user_credential (id,active,password,user_id) values (1,1,'admin','admin');
insert into user_info (id,email,first_name,last_name,phone,user_id) values(1,'admin@admin','admin','admin',903766787,'admin');


insert into user_credential (id,active,password,user_id) values (2,1,'foo','bar');
insert into user_info (id,email,first_name,last_name,phone,user_id) values(2,'foo@admin','foo','bar',903766787,'foo');


delete from user_role;
insert into user_role (id,role,user_id) values (1,'ROLE_ADMIN',1);
insert into user_role (id,role,user_id) values (2,'CUSTOMER_READ',1);
insert into user_role (id,role,user_id) values (3,'PRODUCT_WRITE',1);
insert into user_role (id,role,user_id) values (4,'ORDER_READ',1);
insert into user_role (id,role,user_id) values (5,'PRODUCT_WRITE',1);
insert into user_role (id,role,user_id) values (6,'ORDER_WRITE',1);

insert into user_role (id,role,user_id) values (7,'ROLE_USER',2);


```
