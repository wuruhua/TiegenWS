DROP TABLE IF EXISTS USERINFO;
DROP TABLE IF EXISTS SERVICEPROVIDERINFO;
DROP TABLE IF EXISTS RATINGS;
DROP TABLE IF EXISTS BOOKINGS;
DROP TABLE IF EXISTS BOOKMARKS;

CREATE TABLE IF NOT EXISTS USERINFO (id INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,  uname VARCHAR(25),  password VARCHAR(25));
CREATE TABLE IF NOT EXISTS SERVICEPROVIDERINFO(id INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY, name VARCHAR(25), type VARCHAR(25), location TEXT, website TEXT, rating FLOAT, price FLOAT);
CREATE TABLE IF NOT EXISTS BOOKINGS(id INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY, userId INTEGER, serviceId INTEGER, date DATE, time VARCHAR(25));
CREATE TABLE IF NOT EXISTS RATINGS(id INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY, bookingId INTEGER, userId INTEGER, serviceId INTEGER, rating FLOAT, review TEXT);
CREATE TABLE IF NOT EXISTS BOOKMARKS(id INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY, userId INTEGER, serviceId INTEGER);

DELETE FROM USERINFO;
DELETE FROM SERVICEPROVIDERINFO;
DELETE FROM RATINGS;
DELETE FROM BOOKINGS;
DELETE FROM BOOKMARKS;

INSERT IGNORE INTO RATINGS (id, userId, serviceId, bookingId, rating, review) VALUES(1, 1, 1, 2, 2.34, "hello there");
INSERT IGNORE INTO BOOKINGS (id, userId, serviceId, date, time) values(2, 1, 1, '2016-05-03', '11:30');
insert ignore into bookmarks (id, userId, serviceId) values (2, 1, 1);
insert ignore into serviceproviderinfo(id, name, type, location, website, rating, price) values( 1, "foo", "bar", "bla", "web", 5.968, 99.99);
insert ignore into serviceproviderinfo(id, name,  location, type, website, rating, price) values( 2, "hfoo", "bar", "housekeeping", "web", 4.968, 99.99);
insert ignore into serviceproviderinfo(id, name,  location, type,  website, rating, price) values( 3, "ffoo", "bar", "food", "web", 3.8, 99.99);
insert ignore into serviceproviderinfo(id, name,  location,type, website, rating, price) values( 4, "wfoo", "bar", "health", "web", 4.68, 99.99);
insert ignore into userinfo(id, uname, password) values (1, "kt", "password");



