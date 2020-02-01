INSERT INTO users (username, password,enabled) values ('foo','bar',true );
INSERT INTO users (username, password,enabled) values ('admin','admin',true );
INSERT INTO authorities (username, authority) VALUES ('foo','ROLE_USER');
INSERT INTO authorities (username, authority) VALUES ('admin','ROLE_ADMIN');
