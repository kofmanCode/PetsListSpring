ALTER TABLE pets ALTER COLUMN id RESTART WITH 1;

insert into type (type) values ('Cat');
insert into type (type) values ('Dog');
insert into type (type) values ('Horse');
insert into type (type) values ('Rabbit');
insert into type (type) values ('Parrot');

insert into fur_color (fur_color) values ('Black');
insert into fur_color (fur_color) values ('White');
insert into fur_color (fur_color) values ('Brown');
insert into fur_color (fur_color) values ('Yellow');
insert into fur_color (fur_color) values ('Blue');

insert into country (country) values ('Estonia');
insert into country (country) values ('Latvia');
insert into country (country) values ('Lithuania');
insert into country (country) values ('Finland');
insert into country (country) values ('Sweden');
insert into country (country) values ('Norway');

insert into pets (name, code, type, fur_color, country) values ('Mustikas', '202211151535', 'Cat', 'Black', 'Estonia');
insert into pets (name, code, type, fur_color, country) values ('Roy', '202211151536', 'Dog', 'Brown', 'Latvia');
insert into pets (name, code, type, fur_color, country) values ('Charles', '202211151536', 'Horse', 'White', 'Norway');