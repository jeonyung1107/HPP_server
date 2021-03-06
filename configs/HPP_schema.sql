CREATE TABLE IF NOT EXISTS user(
	id varchar(100) not null unique,
	password char(60) not null,
	authority char(60) not null,
	enabled boolean not null default true,
	primary key (id)
)default character set utf8 collate utf8_general_ci;

CREATE TABLE IF NOT EXISTS muscle(
	id char(10) primary key ,
	name varchar(100) not null ,
	korean varchar(100),
	parent char(10),
	foreign key (parent) references muscle(id)
)default character set utf8 collate utf8_general_ci;

CREATE TABLE IF NOT EXISTS workout(
	id char(10) primary key ,
	name varchar(100) not null ,
	muscle char(10) not null ,
	unit char(10),
	foreign key (muscle) references muscle(id)
)default character set utf8 collate utf8_general_ci;

CREATE TABLE IF NOT EXISTS session(
	id char(16) primary key ,
	start timestamp default current_timestamp,
	end timestamp default current_timestamp on update current_timestamp
)default character set utf8 collate utf8_general_ci;

CREATE TABLE IF NOT EXISTS workout_set(
    id        char(10) primary key,
    session   char(16) not null,
    workout char(10) not null,
    intensity int      not null,
    numberof  int      not null,
    writtentime      timestamp default current_timestamp,
    foreign key (workout) references workout (id),
    foreign key (session) references session (id)
)default character set utf8 collate utf8_general_ci;

CREATE TABLE IF NOT EXISTS user_session(
	user varchar(100),
	session char(16),
	primary key (user, session),
	foreign key (user) references user(id),
	foreign key (session) references session(id)
)default character set utf8 collate utf8_general_ci;



