DROP DATABASE IF EXISTS People_friends;
CREATE DATABASE People_friends;

USE People_friends;

DROP TABLE IF EXISTS categories;
CREATE TABLE categories(
	id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    category_name VARCHAR(45) NOT NULL
);

INSERT INTO categories (category_name) VALUES 
	('pet'),
    ('pack animal');
    
    

DROP TABLE IF EXISTS kinds_animals;
CREATE TABLE kinds_animals(
	id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(45) NOT NULL,
    category_id INT UNSIGNED NOT NULL,
    FOREIGN KEY (category_id) REFERENCES categories(id) ON UPDATE CASCADE ON DELETE CASCADE
);

INSERT INTO kinds_animals (title, category_id) VALUES
	('humster', 1),
    ('dog', 1),
    ('cat', 1),
    ('horse', 2),
    ('donkey', 2),
    ('camel', 2);
    



DROP TABLE IF EXISTS comands;
CREATE TABLE comands(
	id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    comand VARCHAR(45) NOT NULL
);

INSERT INTO comands (comand) VALUES
	('GO'),
    ('STOP'),
    ('LEFT'),
    ('RIGHT'),
    ('JUMP'),
    ('SIT'),
    ('LIE');
    
    
    

DROP TABLE IF EXISTS animals_list;
CREATE TABLE animals_list(
	id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    animal_name VARCHAR(45) NOT NULL,
    kind_id INT UNSIGNED NOT NULL,
    birthday DATE,
    FOREIGN KEY (kind_id) REFERENCES kinds_animals(id) ON UPDATE CASCADE ON DELETE CASCADE
);

INSERT INTO animals_list (animal_name, kind_id, birthday) VALUES
	('Murzik', 3, "2021-03-05"),
    ('Vasiliy', 3, "2015-01-06"),
    ('Jerry', 1, "2023-03-05"),
    ('Homyak', 1, "2022-03-05"),
    ('Homa', 1, "2023-01-23"),
    ('Rex', 2, "2011-03-05"),
    ('Igogo', 4, "2021-03-05"),
    ('IA', 5, "2021-03-05"),
    ('Verblud', 6, "2021-03-05"),
    ('IgogoSha', 4, "2021-03-05"),
    ('IAsha', 5, "2021-03-05");

DROP TABLE IF EXISTS animals_comands;
CREATE TABLE animals_comands(
	id_animal INT UNSIGNED NOT NULL,
    id_comand INT UNSIGNED NOT NULL,
    FOREIGN KEY (id_animal) REFERENCES animals_list(id) ON UPDATE CASCADE ON DELETE CASCADE,
    FOREIGN KEY (id_comand) REFERENCES comands(id) ON UPDATE CASCADE ON DELETE CASCADE,
    PRIMARY KEY (id_animal, id_comand)
);


INSERT INTO animals_comands (id_animal, id_comand) VALUES
	(1, 1),
    (1, 2),
    (2, 1),
    (2, 2),
    (3, 6),
    (3, 7),
    (4, 1),
    (4, 3),
    (4, 4),
    (5, 1),
    (5, 5),
    (6, 2),
    (6, 7),
    (6, 4);



    
	