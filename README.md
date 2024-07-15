# Java Spring Boot Application for Database Management

This repository contains a Java Spring Boot application designed to manage and interact with a backend database. The application allows users to view the existing data stored in the database and also provides functionality to input new data, which gets uploaded and stored in the backend database.

## Features

- **View Existing Data:** Display the current records stored in the database.
- **User Input:** Accept input from users to add new records to the database.
- **Data Management:** Update the database with the user-provided information seamlessly.

## Technologies Used

- **Java Spring Boot:** Framework for building the application.
- **Thymeleaf:** For rendering views.
- **Spring Data JPA:** For database interactions.
- **H2 Database:** Embedded database for development and testing.

## Getting Started

### Prerequisites

- JDK 11 or higher
- Maven

### Installation

1. Clone the repository:
    ```bash
    git clone https://github.com/Aditi-1712/SpringBoot.git
    ```
2. Navigate to the project directory:
    ```bash
    cd SpringBoot
    ```
3. Build the project using Maven:
    ```bash
    mvn clean install
    ```
4. Run the application:
    ```bash
    mvn spring-boot:run
    ```

### Usage

1. Access the application at `http://localhost:8090/web` in your web browser.
2. Use the provided interface to view and manage the database records.
3. Input new data through the forms and submit to update the database.

## Contributing

Contributions are welcome! Please fork the repository and create a pull request with your changes.


