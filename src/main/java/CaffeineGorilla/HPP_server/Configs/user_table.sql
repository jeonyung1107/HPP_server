CREATE TABLE IF NOT EXISTS user(
	id integer auto_increment,
	email varchar(100) not null unique,
	password char(60) not null,
	primary key (id, email)
)
