DROP database lesson_2;
create database lesson_2;
use lesson_2;

DROP TABLE IF EXISTS Vehicle;
create table Vehicle(
                        id INT AUTO_INCREMENT PRIMARY KEY,
                        Manufacturer VARCHAR(50),
                        Model VARCHAR(50),
                        Year INT,
                        Price INT,
                        Color VARCHAR(50),
                        Type VARCHAR(50),
                        EngineSize INT,
                        Mileage INT,
                        num_Doors INT);


-- Create table Car
CREATE TABLE Car (
                     id INT AUTO_INCREMENT PRIMARY KEY,
                     Manufacturer VARCHAR(50),
                     Model VARCHAR(50),
                     Year INT,
                     Price INT,
                     Color VARCHAR(50),
                     Mileage INT,
                     num_Doors INT
);


-- Create table Motorcycle
CREATE TABLE Motorcycle (
                            id INT AUTO_INCREMENT PRIMARY KEY,
                            Manufacturer VARCHAR(50),
                            Model VARCHAR(50),
                            Year INT,
                            Price INT,
                            Type VARCHAR(50),
                            EngineSize INT

);
INSERT INTO Car(Manufacturer, Model, Year, Price, Color, Mileage, num_Doors)
VALUES
    ("Lada", "Largus", 2016, 10000, "Silver", 1000, 20000);

INSERT INTO Motorcycle(Manufacturer, Model, Year, Price, Type, EngineSize)
VALUES
    ("Harley-Davidson", "Sportster", 2020, 12000, "Sport", 1200);

-- Вставка данных из таблицы Car в таблицу Vehicle
INSERT INTO Vehicle (Manufacturer, Model, Year, Price, Color, Mileage, num_Doors)
SELECT Manufacturer, Model, Year, Price, Color, Mileage, num_Doors
FROM Car;


-- Вставка данных из таблицы Motorcycle в таблицу Vehicle
INSERT INTO Vehicle (Manufacturer, Model, Year, Price, Type, EngineSize)
SELECT Manufacturer, Model, Year, Price, Type, EngineSize
FROM Motorcycle;

-- Вывод объединённых данных из таблицы Vehicle
SELECT * FROM Vehicle;