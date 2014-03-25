DROP TABLE IF EXISTS Players;
CREATE TABLE Players
(
	PlayerID int identity,
	FirstName varchar(255),
	LastName varchar(255)
);

INSERT INTO Players (FirstName, LastName) VALUES ('Joey', 'Daly');
INSERT INTO Players (FirstName, LastName) VALUES ('John', 'Perez');