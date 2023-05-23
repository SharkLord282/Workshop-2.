# Workshop-2
## The program is used to manage the users data table containing id, username, email and password.
 
 ```
+------------------+--------------+------+-----+---------+----------------+
| Field            | Type         | Null | Key | Default | Extra          |
+------------------+--------------+------+-----+---------+----------------+
| id               | int(11)      | NO   | PRI | NULL    | auto_increment |
| email            | varchar(255) | NO   | UNI | NULL    |                |
| username         | varchar(255) | NO   |     | NULL    |                |
| password         | varchar(60)  | NO   |     | NULL    |                |
+------------------+--------------+------+-----+---------+----------------+
```


## Technologies
Project is create witch
* Mysql Database
* Java Language
* Bcrypt encryption


## Features
* UserDao - contains all the methods to manage the database
* DbUtil - contains a method to connect to the database
* user - contains the user class
* main - includes task manager (Warning it was crated mainly for quckly and efficient testing of UserDao methods, so it is underdeveloped)
