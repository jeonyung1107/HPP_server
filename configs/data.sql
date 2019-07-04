INSERT into muscle(id, name, korean) VALUES ("DH6unzClxG", "chest", "가슴");
INSERT into muscle(id, name, korean, parent) VALUES ("yG8GOzVh3X", "pectoralis major","대흉근","DH6unzClxG");
INSERT into muscle(id, name, korean, parent) VALUES ("dvrSQLopev", "pectoralis major upper side", "대흉근 상부","yG8GOzVh3X");
INSERT into muscle(id, name, korean, parent) VALUES ("jzJamIhu2j", "pectoralis major under side", "대흉근 하부","yG8GOzVh3X");
INSERT into muscle(id, name, korean) VALUES ("sEsEhhCNae", "arm", "팔");
INSERT into muscle(id, name, korean, parent) VALUES ("2E9h4I2u5o", "Biceps brachii", "이두근", "sEsEhhCNae");
INSERT into muscle(id, name, korean, parent) VALUES ("0WGhUb6ba9", "Triceps", "삼두근", "sEsEhhCNae");
INSERT into muscle(id, name, korean, parent) VALUES ("IYFbcvkbTe", "antebrachial muscles", "전완근", "sEsEhhCNae");
INSERT into muscle(id, name, korean) VALUES ("IYFbcvkbTe", "back", "등");
INSERT into muscle(id, name, korean, parent) VALUES ("3fsT7KhkxM", "Latissimus dorsi", "광배근", "IYFbcvkbTe");
INSERT into muscle(id, name, korean, parent) VALUES ("3QUPLL7dH6", "Trapezius Muscle", "승모근", "IYFbcvkbTe");
INSERT into muscle(id, name, korean, parent) VALUES ("lFNsA6p1oQ", "spinal erector muscle", "척추기립근", "IYFbcvkbTe");
INSERT into muscle(id, name, korean) VALUES ("IZzod35d3u", "leg", "다리");
INSERT into muscle(id, name, korean, parent)
VALUES ("WaCFI95Ms9", "Gluteus maximus", "대둔근", "IZzod35d3u"),("3lxSxNs3Pf", "femoral muscle", "대퇴근", "IZzod35d3u");

INSERT INTO workout(id, name, muscle, unit) VALUES ("1x0W279amU", "biceps arm curl", "2E9h4I2u5o", "KG");
INSERT INTO workout(id, name, muscle, unit) VALUES ("NCzanU2aN7", "triceps extension", "0WGhUb6ba9", "KG");
INSERT INTO workout(id, name, muscle, unit) VALUES ("WG9XtAC7xB", "deadlift", "lFNsA6p1oQ", "KG");

