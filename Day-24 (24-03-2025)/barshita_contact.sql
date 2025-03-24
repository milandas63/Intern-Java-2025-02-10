DROP DATABASE IF EXISTS barshita;
CREATE DATABASE IF NOT EXISTS barshita;
USE barshita;

##########################
##### Relationship #######
##########################
SELECT "relation";
DROP TABLE IF EXISTS relation;
CREATE TABLE relation(
    rel_id       INT(6)        NOT NULL AUTO_INCREMENT,
    rel_desc     VARCHAR(25)   NOT NULL UNIQUE,
    rel_abbr     VARCHAR(15),
    PRIMARY KEY(rel_id)
);
INSERT INTO relation VALUES
    (1, "Faculty",              NULL),
    (2, "Relatives",            NULL),
    (3, "School Friends",       NULL),
    (4, "College Friends",      NULL),
    (5, "Professional Friends", NULL),
    (6, "Childhood Friend",     NULL);
SELECT "relation-end";


#####################
###   Location   ####
#####################
SELECT "location";
DROP TABLE IF EXISTS location;
CREATE TABLE location(
    loc_id          INT(6)          NOT NULL AUTO_INCREMENT,
    loc_desc        VARCHAR(25)     NOT NULL UNIQUE,
    loc_abbr        VARCHAR(10),
    PRIMARY KEY(loc_id)
);
INSERT INTO location VALUES
    ( 1, "Bhubaneswar",     "BBSR"),
    ( 2, "Cuttack",         "CTC"),
    ( 3, "Bhawanipatna",    "BHPT"),
    ( 4, "Rourkella",       "RKL"),
    ( 5, "Vishakapatnam",   "VSKP");
SELECT "location-end";


####################
###   Contact   ####
####################
SELECT "contact";
DROP TABLE IF EXISTS contact;
CREATE TABLE contact(
    con_id          INT(6)                  NOT NULL AUTO_INCREMENT,
    con_name        VARCHAR(25)             NOT NULL UNIQUE,
    gender          ENUM('F','M','O')       DEFAULT NULL,
    dob             DATE,
    email_id        VARCHAR(50),
    mobile_no       VARCHAR(15),
    rel_id          INT(6)                  NOT NULL REFERENCES relation(rel_id),
    loc_id          INT(6)                  NOT NULL REFERENCES location(loc_id),
    PRIMARY KEY(con_id)
);
INSERT INTO contact VALUES
    (1, "Milan Das",         "M", "1963-11-25", "milandas53@gmail.com",  "7978168568", 1, 1),
    (2, "Barshita Pattnaik", "F", "2002-11-25", "barshita07@gmail.com",  "7684806111", 2, 2),
    (3, "Sonali Das",        "F", "2002-05-14", "sonali80@gmail.com",	 "765298766",  2, 3),
    (4, "Suraj",             "M", "2000-08-11", "suraj90@gmail.com",	 "6342899036", 3, 4),
    (5, "Vaibhav",			 "M", "2000-11-20", "vaibhav@gmail.com",	 "8977654389", 1, 5),
    (6, "Chinmaya Rout",	 "M", "2001-11-28", "chinmaya890@gmail.com", "9843524589", 4, 1);
SELECT "contact-end";


SELECT c.con_id,c.con_name,c.gender,c.mobile_no,r.rel_desc,l.loc_desc FROM contact AS c LEFT JOIN relation AS r ON r.rel_id=c.con_id LEFT JOIN location AS l ON l.loc_id=c.loc_id



