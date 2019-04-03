CREATE TABLE IF NOT EXISTS user(
	id varchar(100) not null unique,
	password char(60) not null,
	authority char(60) not null,
	enabled boolean not null default true,
	primary key (id)
)
