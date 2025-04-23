# 📊 Tax Calculator – Java (Maven)

A simple, production-ready Java application that calculates income tax based on defined slabs using Object-Oriented Principles and clean code practices. Built with Maven and includes unit tests using JUnit 5.

---

## 🚀 Features:

- Calculates income tax for individuals based on Indian tax slabs
- Clean separation of concerns using models, services, and controllers
- Robust input validation with meaningful error messages
- Unit tests written using JUnit 5
- Fully Maven-managed build and dependency lifecycle

---

## 💰 Tax Slabs Used:

| Income Range             | Tax Rate |
|--------------------------|----------|
| ₹0 – ₹3,50,000           | 0%       |
| ₹3,50,001 – ₹6,25,000    | 9%       |
| ₹6,25,001 – ₹12,00,000   | 18%      |
| ₹12,00,001 and above     | 35%      |

---

## 🛠 Tech Stack & Requirements

### 🧪 Language & Build System
- **Java**: 1.8+
- **Maven**: Project management and build automation
- **JUnit 5**: Unit testing

---

## 💻 How to Run:

Run from terminal (uses Maven Exec Plugin):

```bash
mvn clean compile exec:java
```
Or run the Main class directly from your IDE.

---

## ✅ How to Test

Run all tests with:
```bash
mvn clean test
```
Generate test report:
```bash
mvn surefire-report:report
```
Generate coverage report:
```bash
mvn jacoco:report
```
Open in browser:
```bash
open target/site/jacoco/index.html      # macOS
start target/site/jacoco/index.html     # Windows
open target/site/surefire-report.html   # macOS
start target/site/surefire-report.html  # Windows
```
---

## 🧪 Sample Unit Test Locations:

TaxServiceImplTest.java: Tests various income cases
InputValidatorTest.java: Validates input parsing & exceptions

---

## 📄 License
This project is for evaluation/demo purposes only. All rights reserved by the author.
