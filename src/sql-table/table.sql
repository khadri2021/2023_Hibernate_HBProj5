CREATE TABLE ORDERZOMOTO(uuid varchar(36),orderid varchar(10),ordername varchar(30));
select count(*) from orderzomoto;
select * from orderzomoto;
 
-- truncate table orderzomoto;

CREATE TABLE PATIENT(TOKENNUMBER INT,NAME VARCHAR(30));
select * from patient;

-- drop table PHONESIM;
CREATE TABLE PHONESIM(simsupport INT,phonename VARCHAR(30)) ;
ALTER TABLE PHONESIM MODIFY simsupport int NOT NULL AUTO_INCREMENT primary key;

select * from phonesim;

CREATE TABLE ADHAAR(adhaarnumber varchar(36),citizenname VARCHAR(30)) ;