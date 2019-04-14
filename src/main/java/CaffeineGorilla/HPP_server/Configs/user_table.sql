create user if not exists hpp idenetified by '1234'
grant all privileges on hpp.* to 'hpp'@'localhost' identified by '1234';

CREATE TABLE IF NOT EXISTS user(
	id varchar(100) not null unique,
	password char(60) not null,
	authority char(60) not null,
	enabled boolean not null default true,
	primary key (id)
)
