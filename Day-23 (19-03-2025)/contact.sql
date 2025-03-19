DROP DATABASE IF EXISTS barshita;
CREATE DATABASE IF NOT EXISTS barshita;
USE barshita;

#########################
###   Relationship   ####
#########################
SELECT "relation";
DROP TABLE IF EXISTS relation;
CREATE TABLE relation(
	rel_id			INT(6)			NOT NULL AUTO_INCREMENT,
	rel_desc        VARCHAR(25)		NOT NULL UNIQUE,
	rel_abbr        VARCHAR(10),
	PRIMARY KEY(rel_id)
);
INSERT INTO relation VALUES
	(1, "Faculty",				NULL),
	(2, "Blood Relation",		NULL),
	(3, "Relatives",			NULL),
	(4, "School Friends",		NULL),
	(5, "College Friends",		NULL),
	(6, "Professional Friends", NULL),
	(7, "Childhood Friend",		NULL);


#####################
###   Location   ####
#####################
SELECT "location";
DROP TABLE IF EXISTS location;
CREATE TABLE location(
	loc_id			INT(6)			NOT NULL AUTO_INCREMENT,
	loc_desc		VARCHAR(25)		NOT NULL UNIQUE,
	loc_abbr		VARCHAR(10),
	PRIMARY KEY(loc_id)
);
INSERT INTO location VALUES
	( 1, "Bhubaneswar", "BBSR"),
	( 2, "Cuttack", "CTC"),
	( 3, "Bhawanipatna", "BHPT"),
	( 4, "Rourkella", "RKL"),
	( 5, "Vishakapatnam", "VSKP"),
	( 6, "United States", "US");


####################
###   Contact   ####
####################
SELECT "contact";
DROP TABLE IF EXISTS contact;
CREATE TABLE contact(
	con_id			INT(6)				NOT NULL AUTO_INCREMENT,
	con_name        VARCHAR(25)			NOT NULL UNIQUE,
	gender			ENUM('F','M','O')	DEFAULT NULL,
	dob				DATE,
	email_id		VARCHAR(50),
	mobile_no		VARCHAR(15),
	rel_id			INT(6)				NOT NULL REFERENCES relation(rel_id),
	loc_id          INT(6)              NOT NULL REFERENCES location(loc_id),
	PRIMARY KEY(con_id)
);
INSERT INTO contact VALUES
	(1, "Milan Das", "M", "1963-11-25", "milandas53@gmail.com", "7978168568", 1, 1),
