# Spring CRUD Project

Welcome to the Spring CRUD Project! This web application empowers users to seamlessly manage product information through Create, Read, Update, and Delete (CRUD) operations. With a responsive and intuitive interface, you can easily add, view, modify, and remove products, streamlining your product management process.

## HomePage
![springcrud homepage](https://github.com/zahidulhasan95503/springcrudproject/assets/102205229/26540d14-aaf0-42ce-b2bd-2f858d83f676)
## Add Products
![springcrudadd](https://github.com/zahidulhasan95503/springcrudproject/assets/102205229/b7bbd2b6-1de8-4655-bc7f-3e2849217bde)
## Delete Products
![delete](https://github.com/zahidulhasan95503/springcrudproject/assets/102205229/dfcc12ec-54aa-4a73-be90-3719759404fd)
## Update Products
![springcrudupdate](https://github.com/zahidulhasan95503/springcrudproject/assets/102205229/7c1ef2d9-cfeb-4fc1-8562-0970a4404279)



## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
  - [Add Products](#add-products)
  - [View Products](#view-products)
  - [Update Products](#update-products)
  - [Delete Products](#delete-products)
- [Technologies](#technologies)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
  - [Configuration](#configuration)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Introduction

The Spring CRUD Project simplifies the management of product data. With its straightforward interface and efficient functionalities, you can effortlessly handle your products' lifecycle, ensuring accurate and up-to-date information.

## Features

### Add Products

Quickly introduce new products into the system by providing essential details like name, description, and price. The application guides you through the process, enabling accurate input and organized records.

### View Products

Browse through your product inventory to get a comprehensive overview. Each product's snapshot displays key information, offering a convenient way to find products. Advanced search and filtering options make it easy to locate specific items.

### Update Products

Maintain accurate product details by making real-time adjustments. Whether it's modifying the price, updating the description, or revising other attributes, Spring CRUD Project makes updates a breeze. Detailed logging ensures a history of changes for each product.

### Delete Products

When products are no longer relevant, efficiently remove them from the database. By deleting obsolete products, you keep your inventory current and well-maintained. Deleted items are archived for reference purposes.

## Technologies

The Spring CRUD Project employs a combination of frontend and backend technologies for a cohesive user experience.

- Frontend:
  - HTML
  - CSS
  - JavaScript

- Backend:
  - Spring Framework

- Database:
  - MySQL

## Getting Started

Follow these steps to set up and run the Spring CRUD Project on your local machine.

### Prerequisites

Ensure you have the following prerequisites installed:

- Java Development Kit (JDK)
- MySQL Server
- Modern web browser (Chrome, Firefox, Edge, etc.)

### Installation

1. Clone the repository:

```bash
 git clone https://github.com/zahidulhasan95503/springcrudproject.git
```




2. Navigate to the project directory:

```bash
  cd springcrudproject
```

### Configuration 

1. Configure the database settings in'src/main/resources/application.properties':

```bash
spring.datasource.url=jdbc:mysql://localhost:3306/productdb
spring.datasource.username=your-username
spring.datasource.password=your-password
```
2. Build and run the application using Maven

```bash
./mvnw spring-boot:run
```
Access the application at http://localhost:8080
## Usage

1. Open your web browser and navigate to http://localhost:8080.
2. Utilize the provided interface for product management.
3. Enjoy streamlined product management!


## Contributing

Contributions are welcomed! To contribute, create pull requests or issues in the GitHub repository.

When contributing, adhere to existing coding standards, provide clear commit messages, and ensure thorough testing.
