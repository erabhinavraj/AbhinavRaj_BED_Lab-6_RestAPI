# AbhinavRaj_BED_Lab-6_RestAPI
This project is a web application designed to manage student registrations for a Debate event during a college fest. Utilizing Spring MVC and Hibernate ORM, it enables efficient tracking and management of student details based on their courses while implementing role-based access control.
Key Features
Student Registration: Allows students to register for the Debate event by providing their personal details, including name and course.
CRUD Operations:
Insert new student records into the database.
Update existing student records as necessary.
Delete records that are no longer required.
Print all student records for review.
Role-Based Security:
ADMIN Role: Full access to perform all CRUD operations on student records.
USER Role: Limited to viewing and saving details; cannot modify or delete records.
Technologies Used
Spring Boot: For creating a robust web application.
Spring MVC: For managing HTTP requests and rendering views.
Hibernate ORM: For object-relational mapping and seamless database interactions.
Spring Security: For implementing role-based authentication and authorization.
H2 Database/MySQL: For persistent storage of student registration data.
Thymeleaf: For rendering dynamic web pages.
Getting Started
To run the application locally, clone this repository, build it using Maven, and configure your database settings in the application.properties file. This project is an excellent resource for learning how to develop a full-stack Java web application with security features.
