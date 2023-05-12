DROP DATABASE pilisaru;
CREATE DATABASE pilisaru;
USE pilisaru;


CREATE TABLE Admin(
                      UserName VARCHAR(60) PRIMARY KEY ,
                      password VARCHAR(50)
);

CREATE TABLE Employee(
                         NIC VARCHAR(30) PRIMARY KEY ,
                         Name VARCHAR(30),
                         Address VARCHAR(30)
);

CREATE TABLE Health(
                       NIC VARCHAR(30),
                       Cost DECIMAL (10,2),
                       Date date ,
                       Chechups longblob,
                       CONSTRAINT FOREIGN KEY(NIC) REFERENCES Employee(NIC)
);

CREATE TABLE Inventory(
                          Id VARCHAR(30) PRIMARY KEY,
                          Name  VARCHAR (100)
);

CREATE TABLE Compost(
                        Id VARCHAR(30) PRIMARY KEY,
                        Tea  DECIMAL (10,2) ,
                        Coconut  DECIMAL (10,2),
                        Rubber  DECIMAL (10,2) ,
                        quantity DECIMAL (10,2)
);

CREATE TABLE Piles(
                      Id INT PRIMARY KEY,
                      Temperature  DECIMAL (10,2) ,
                      WaterLevel  DECIMAL (10,2),
                      vehiId  VARCHAR (10),
                      weight DECIMAL (10,2),
                      council VARCHAR (30)
);

CREATE TABLE Sales(
                      ID VARCHAR(30) PRIMARY KEY ,
                      Date date ,
                      quantity DECIMAL (10,2),
                      profit DECIMAL (10,2)
);

CREATE TABLE Machine(
                        ID VARCHAR(30) PRIMARY KEY ,
                        name VARCHAR(30)
);

CREATE TABLE EmployeeEquipment(

                                  ID VARCHAR(10) PRIMARY KEY,
                                  name VARCHAR (30),
                                  quantity DECIMAL (10,2)
);

CREATE TABLE Chemicals(
                          ID VARCHAR(30) PRIMARY KEY,
                          name VARCHAR (30),
                          quantity DECIMAL (10,2)
);

CREATE TABLE SiteVehicle(
                            ID VARCHAR(30) PRIMARY KEY,
                            name VARCHAR (30),
                            repair tinyint(1)
);


select * from Admin;
select * from Employee;
select * from Health;
select * from Inventory;
select * from Compost;
select * from Piles;
select * from Sales;
select * from Machine;
select * from EmployeeEquipment;
select * from Chemicals;
select * from SiteVehicle;
