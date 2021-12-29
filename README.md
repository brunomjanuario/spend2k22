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

## Images

Home Menu<br/>
<br/>
![HomeMenu](https://user-images.githubusercontent.com/89805451/147690936-f8c7925e-6e96-49b9-bd06-2b560c464328.png)

Month Menu<br/>
<br/>
![MonthMenu](https://user-images.githubusercontent.com/89805451/147690989-1048b2ea-64f7-41a1-b7fd-36dc30a96f0f.png)

Insert Amount<br/>
<br/>
![Insert Amount](https://user-images.githubusercontent.com/89805451/147691019-d24eb3bd-f1c5-46e3-8180-95f0f87b9c5b.png)
