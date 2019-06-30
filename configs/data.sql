INSERT into muscle(id, name) VALUES ("DH6unzClxG", "chest");;
INSERT into muscle(id, name, parent) VALUES ("yG8GOzVh3X", "pectoralis major","DH6unzClxG");
INSERT into muscle(id, name, parent) VALUES ("dvrSQLopev", "pectoralis major upper side","yG8GOzVh3X");
INSERT into muscle(id, name, parent) VALUES ("jzJamIhu2j", "pectoralis major under side","yG8GOzVh3X");
INSERT into muscle(id, name) VALUES ("sEsEhhCNae", "arm");
INSERT into muscle(id, name, parent) VALUES ("2E9h4I2u5o", "Biceps brachii", "sEsEhhCNae");
INSERT into muscle(id, name, parent) VALUES ("0WGhUb6ba9", "Triceps", "sEsEhhCNae");
INSERT into muscle(id, name, parent) VALUES ("IYFbcvkbTe", "antebrachial muscles", "sEsEhhCNae");
INSERT into muscle(id, name) VALUES ("IYFbcvkbTe", "back");

INSERT INTO workout(id, name, muscle, unit) VALUES ("testtest01", "testtest01", "testmuscle", "KG");
INSERT INTO workout(id, name, muscle, unit) VALUES ("testtest02", "testtest02", "testparent", "KG");
INSERT INTO workout(id, name, muscle, unit) VALUES ("testtest03", "testtest03", "testchild1", "KG");

