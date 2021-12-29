# Financial Control App
Personal financial control application.

## The idea 
I am a very spare person and I was tired of controlling my expenses and earnings with excel sheets, so I decided to create this application.
This tool allows us to control our economy during the year.

## Development

The application is divided into, View, Controller, Service and Model.
I used an SQL database to check customer information. The model only consists of a month class. 
In the service we have all the business logic, and it communicates with the model through a DAO. 
The Controller serves as a link between the View and the Service. 
View presents the User Interface, and I used the [Simple Graphics](https://github.com/academia-de-codigo/simple-graphics) library, made by Academia de Codigo.
To be able to use the library with Spring Boot so that it is allowed to use the keyboard to interact with the application I had to set the headless to false.

## Technologies

* Java
* Spring Boot
* MySQL
* Maven
* Hibernate
* [Simple Graphics](https://github.com/academia-de-codigo/simple-graphics)

## How can you use the app

- Clone the repository
- Start the MySQL server
```sh
    $ mysql.server start
```
- Open the jar file
- Or execute it in the terminal:
```sh
    $ java -jar SoccerPong.jar
```
