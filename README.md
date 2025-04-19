# 🛒 RetailMate

A simplified, microservices-based inventory and billing system designed specifically for **retail stores**. RetailMate helps store managers and staff efficiently manage stock, create sales orders, and generate GST-compliant bills.

---

## 🚀 Features

- 🔐 Role-based authentication (`MANAGER`, `CASHIER`)
- 📦 Product and inventory management
- 🧾 Order creation with automatic stock deduction
- 💸 Billing with discounts and tax (e.g., GST)
- 📊 Daily sales reporting (basic)

---

## 🧩 Microservices Architecture

| Service | Description |
|---------|-------------|
| `auth-service` | Handles login, JWT generation, and role management |
| `product-service` | Add/update products, manage price and units |
| `inventory-service` | Stock in/out operations, alert thresholds |
| `order-service` | Order creation and order history tracking |
| `billing-service` | Bill generation with tax/discount and reporting |

---

## 🛠️ Tech Stack

- **Java 17**
- **Spring Boot** (REST APIs)
- **MySQL / PostgreSQL**
- **Spring Security + JWT**
- **Docker & Docker Compose** (for local orchestration)
- **Maven** (build tool)

---

## 📁 Folder Structure

```
retailmate/
│
├── auth-service/
├── product-service/
├── inventory-service/
├── order-service/
├── billing-service/
└── README.md
```

---

## 🧪 Future Enhancements

- 📉 Advanced sales analytics
- 🔔 Stock threshold notifications
- 🏪 Multi-store (branch-wise) support
- 🧾 PDF invoice generation
- 📱 Frontend for store staff (React/Angular)

---

## 👨‍💻 Getting Started

> Prerequisite: Java 17+, Maven, Docker (for optional containerization)

```bash
# Clone the repo
git clone https://github.com/yourusername/retailmate.git
cd retailmate

# Run each microservice (e.g., using Maven)
cd auth-service
mvn spring-boot:run
```

> Add `.env` or `application.properties` for database credentials per service.

---

## 📄 License

MIT License – free to use and modify.

---

## 💬 Feedback & Contributions

Contributions are welcome! Feel free to raise issues or submit PRs.
