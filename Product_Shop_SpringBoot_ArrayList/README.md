# Product Shop (Spring Boot + ArrayList)

A simple **Spring Boot** web application for managing a product shop, using an in-memory `ArrayList` instead of a database. This project is mainly a practice exercise for Spring MVC, Thymeleaf, and Bean Validation.

## ✨ Features

- Add a new product (form + validation)
- View the list of all products
- Edit / update a product
- Delete a product
- Input validation using Jakarta Bean Validation (id, name, category, stock, etc.)
- UI rendered with Thymeleaf templates

## 🛠️ Tech Stack

| Technology | Purpose |
|---|---|
| Java 25 | Programming Language |
| Spring Boot 4.1.0 | Backend Framework |
| Spring Web MVC | Controller / Routing |
| Thymeleaf | View / Template Engine |
| Lombok | Reduces boilerplate code (`@Data`, `@NoArgsConstructor`, `@AllArgsConstructor`) |
| Jakarta Validation | Form input validation |
| Maven | Build Tool |

## 📂 Project Structure

```
Product_Shop_SpringBoot_ArrayList/
├── src/main/java/com/abcd/product_shop/
│   ├── ProductShopApplication.java   # Main Spring Boot app
│   ├── Product.java                  # Product model (id, name, category, stock, price)
│   └── ProductController.java        # Controller for Add/List/Edit/Update/Delete
├── src/main/resources/
│   ├── templates/
│   │   ├── from.html                 # Add/Edit form
│   │   └── list.html                 # Product list page
│   ├── static/css.css                # Stylesheet
│   └── application.properties        # App configuration
└── pom.xml
```

## 🔗 Routes / Endpoints

| Method | URL | Description |
|---|---|---|
| GET | `/product/add` | Shows the form to add a new product |
| POST | `/product/add` | Submits the form and saves the new product |
| GET | `/product/list` | Shows the list of all products |
| GET | `/product/edit/{id}` | Loads the product with the given `id` into the edit form |
| POST | `/product/update` | Updates the product |
| GET | `/product/delete/{id}` | Deletes the product with the given `id` |

## ⚙️ Configuration

In `application.properties`:

```properties
spring.application.name=product shop
server.port=9090
logging.file.name=error.log
```

So the app runs on port **9090** by default, and logs are written to `error.log`.

## ▶️ How to Run

1. Clone the project:
   ```bash
   git clone https://github.com/Rabbi1067/Advanced_Java.git
   cd Advanced_Java/Product_Shop_SpringBoot_ArrayList
   ```
2. Run with Maven:
   ```bash
   ./mvnw spring-boot:run
   ```
3. Open in browser:
   ```
   http://localhost:9090/product/add   → to add a new product
   http://localhost:9090/product/list  → to view all products
   ```

## ⚠️ Limitations

- Data is not persisted in a database — all data is lost on app restart (in-memory `ArrayList`).
- Not suitable for multi-user/concurrent environments.

## 📌 Future Improvements

- Add persistent storage using MySQL/PostgreSQL + Spring Data JPA
- Build a REST API version
- Add search and pagination features

## 👤 Author

**Rabbi1067** — [GitHub Profile](https://github.com/Rabbi1067)
