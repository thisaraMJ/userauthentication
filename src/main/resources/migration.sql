CREATE TABLE IF NOT EXISTS userauthentication.user (
id SERIAL PRIMARY KEY,
username VARCHAR(50),
password VARCHAR(255)
);
INSERT INTO userauthentication.user (username, password)
VALUES('username','password');
