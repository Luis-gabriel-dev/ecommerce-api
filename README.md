# 🛒 E-commerce API

A RESTful API for managing orders in an e-commerce system, built with **Spring Boot**, **JPA/Hibernate**, and **MySQL**.

---

## 🚀 Features

- User and client registration
- Product and category management
- Order and order item handling
- Payment tracking per order
- Order status enumeration

---

## 🛠 Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Postman (for API testing)

---

## 🧱 Domain Model

- `User`
- `Order`
- `Product`
- `Category`
- `OrderItem`
- `Payment`
- `OrderStatus` (enum)

---

## 🔄 Relationships

- An `Order` belongs to a `User`
- An `Order` has many `OrderItems`
- A `Product` can belong to many `Categories` (and vice-versa)
- An `Order` can have one `Payment`
- Each `OrderItem` references a `Product`

---

## 📦 How to Run the Project

1. Clone the repository:
   ```bash
   git clone https://github.com/Luis-gabriel-dev/ecommerce-api.git
   ```
2. Open it in [Spring Tool Suite](https://spring.io/tools) or [IntelliJ IDEA](https://www.jetbrains.com/idea/)

3. Configure your MySQL database in:
   ```properties
   src/main/resources/application.properties
   ```

4. Run the application:
   ```bash
   ./mvnw spring-boot:run
   ```

---

## 📬 Main Endpoints

| Method | Route            | Description         |
|--------|------------------|---------------------|
| GET    | `/products`      | List products       |
| POST   | `/products`      | Create a product    |
| GET    | `/orders/{id}`   | Get order by ID     |
| POST   | `/orders`        | Create a new order  |
| etc.   | ...              | ...                 |

*(You can test them using Postman or Insomnia.)*

---

## 📄 License

This project is licensed under the MIT License. See the `LICENSE` file for details.

---

## 👨‍💻 Author

Made with dedication (and a little coffee ☕) by **Luis Gabriel**  
GitHub: [@luis-gabriel-dev](https://github.com/Luis-gabriel-dev)