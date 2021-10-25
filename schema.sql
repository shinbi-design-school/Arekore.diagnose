SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS question;
DROP TABLE IF EXISTS result;
DROP TABLE IF EXISTS user;




/* Create Tables */

CREATE TABLE question
(
	q1 varchar(64),
	q2 varchar(64),
	q3 varchar(64),
	q4 varchar(64),
	q5 varchar(64),
	id int NOT NULL AUTO_INCREMENT,
	PRIMARY KEY (id)
);


CREATE TABLE result
(
	id int NOT NULL AUTO_INCREMENT,
	r1 char,
	r2 char,
	r3 char,
	r4 char,
	r5 char,
	PRIMARY KEY (id)
);


CREATE TABLE user
(
	id int NOT NULL AUTO_INCREMENT,
	account varchar(32) NOT NULL,
	PRIMARY KEY (id),
	UNIQUE (account)
);



