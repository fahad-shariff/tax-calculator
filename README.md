📊 Tax Calculator – Java (Maven)

This is a production-grade tax calculator that computes an individual's total tax based on income and defined tax slabs. The application follows object-oriented design principles, includes unit tests, and is structured for readability and maintainability.

----------------------------------------------------------------------------------------------------------------------------------------------------

🚀 Features:

Income-based tax calculation using defined slabs

Input validation (whole numbers only, no decimals, no negatives)

Modular design (Controller, Service, Model, Utility layers)

Unit tests with JUnit 5

Optional code coverage reporting via JaCoCo

Built with Maven

----------------------------------------------------------------------------------------------------------------------------------------------------

📌 Tax Slabs Used:

Income Range (₹)	Tax Rate
0 – 3,50,000	0%
3,50,001 – 6,25,000	9%
6,25,001 – 12,00,000	18%
12,00,001 and above	35%

🧾 Example:

Input: 25,00,000

Breakdown:
0% on ₹3,50,000
9% on ₹2,75,000
18% on ₹5,75,000
35% on ₹13,00,000

Output: ₹7,12,750.00

----------------------------------------------------------------------------------------------------------------------------------------------------

💻 How to Run:

Run from terminal (uses Maven Exec Plugin):

mvn clean compile exec:java

Or run the Main class directly from your IDE.

----------------------------------------------------------------------------------------------------------------------------------------------------

✅ How to Test

Run all tests with:
mvn clean test

Generate test report:
mvn surefire-report:report

Generate coverage report:
mvn jacoco:report

Open in browser:
open target/site/jacoco/index.html      # macOS
start target/site/jacoco/index.html     # Windows
open target/site/surefire-report.html   # macOS
start target/site/surefire-report.html  # Windows

----------------------------------------------------------------------------------------------------------------------------------------------------

🧪 Sample Unit Test Locations:

TaxServiceImplTest.java: Tests various income cases
InputValidatorTest.java: Validates input parsing & exceptions



