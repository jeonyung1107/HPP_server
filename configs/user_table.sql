CREATE TABLE IF NOT EXISTS user(
	id varchar(100) not null unique,
	password char(60) not null,
	authority char(60) not null,
	enabled boolean not null default true,
	primary key (id)
);

CREATE TABLE IF NOT EXISTS muscle(
	id char(10) primary key ,
	name varchar(100) not null ,
	parent char(10),
	foreign key (parent) references muscle(id)
);

INSERT into muscle(id, name) VALUES ("testmuscle", "testmuscle");
INSERT into muscle(id, name) VALUES ("testtest01", "testmuscle2");
INSERT into muscle(id, name) VALUES ("testparent", "testparetn");
INSERT into muscle(id, name, parent) VALUES ("testchild1", "testchild01", "testparent");

CREATE TABLE IF NOT EXISTS excercise(
	id char(10) primary key ,
	name varchar(100) not null ,
	muscle char(10) not null ,
	unit char(10),
	foreign key (muscle) references muscle(id)
);

INSERT INTO excercise(id, name, muscle, unit) VALUES ("testtest01", "testtest01", "testmuscle", "KG");
INSERT INTO excercise(id, name, muscle, unit) VALUES ("testtest02", "testtest02", "testparent", "KG");
INSERT INTO excercise(id, name, muscle, unit) VALUES ("testtest03", "testtest03", "testchild1", "KG");


CREATE TABLE IF NOT EXISTS session(
	id char(16) primary key ,
	start timestamp default current_timestamp,
	end timestamp default current_timestamp on update current_timestamp
);

CREATE TABLE IF NOT EXISTS excercise_set(
    id        char(10) primary key,
    session   char(16) not null,
    excercise char(10) not null,
    intensity int      not null,
    numberof  int      not null,
    writtentime      timestamp default current_timestamp,
    foreign key (excercise) references excercise (id),
    foreign key (session) references session (id)
);

CREATE TABLE IF NOT EXISTS user_session(
	user varchar(100),
	session char(16),
	primary key (user, session),
	foreign key (user) references user(id),
	foreign key (session) references session(id)
)



