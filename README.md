WriteWave Testing and Automation

Project Overview

This repository encompasses both manual and automated testing efforts for the WriteWave application. It includes test planning, test scenarios, test cases, bug reports, test summaries, and automation scripts to ensure the application's functionality and quality.

Directory Structure

writewave/
├── README.md                                 # Project documentation
├── manual_testing/
│   ├── Test Plan for WriteWave.docx          # Test plan document
│   ├── Test Scenarios for WriteWave.xlsx     # Test scenarios document
│   ├── Test Cases for WriteWave.xlsx         # Test cases document
│   ├── Bug Report for WriteWave.xlsx         # Bug report document
│   ├── Test Summary Report for WriteWave.docx# Test summary report
│   └── Test Mind Map for WriteWave.png       # Test mind map
└── automation_testing/
    ├── src/
    │   ├── main/
    │   │   └── java/
    │   │       ├── base/
    │   │       │   └── BaseTest.java         # Base class for test setup and teardown
    │   │       ├── pages/
    │   │       │   ├── LoginPage.java        # Page Object Model (POM) for Login Page
    │   │       │   ├── DashboardPage.java    # POM for Dashboard Page
    │   │       │   └── CreatePostPage.java   # POM for Create Post Page
    │   │       └── tests/
    │   │           ├── LoginTest.java        # Test cases for Login functionality
    │   │           └── CreatePostTest.java   # Test cases for Create Post functionality
    │   └── test/
    │       └── java/                         # Additional test-specific code if needed
    ├── pom.xml                               # Maven dependencies and configurations
    ├── testng.xml                            # TestNG test suite configuration
    ├── drivers/                              # WebDriver executables (e.g., chromedriver)
    ├── reports/                              # Test execution reports
    ├── logs/                                 # Log files for debugging
    └── screenshots/                          # Screenshots for failed test cases

Manual Testing Approach

The manual testing process includes:

Test Plan: Defines the testing scope, objectives, and methodology.

Test Scenarios: Identifies different functional and non-functional scenarios to test.

Test Cases: Documents detailed test steps, expected results, and actual results.

Bug Report: Logs issues found during testing with severity and steps to reproduce.

Test Summary Report: Summarizes the testing outcomes and overall quality assessment.

Test Mind Map: A visual representation of the testing strategy and coverage.

Automation Testing Approach

The automation framework is built using Selenium with Java, following the Page Object Model (POM) design pattern. It integrates best practices for maintainability and scalability, supporting TestNG for test execution and Maven for dependency management.

Features

Page Object Model (POM): Enhances test maintainability by separating page elements and actions.

TestNG Integration: Facilitates structured test execution and reporting.

Maven for Dependency Management: Simplifies project setup and dependency handling.

Cross-Browser Testing: Ensures application functionality across different browsers.

Detailed Reporting: Generates comprehensive test execution reports.

Prerequisites

Java Development Kit (JDK) 8 or higher

Maven

Selenium WebDriver

TestNG

An IDE like IntelliJ IDEA or Eclipse

Installation & Setup

Clone the Repository:

git clone https://github.com/RashmiNinawe13/writewave.git

Navigate to the Project Directory:

cd writewave/automation_testing

Install Dependencies:

mvn clean install

Running Tests

Execute All Tests:

mvn test

Execute Specific Test Suite:

mvn test -DsuiteXmlFile=testng.xml

Reporting

Test execution reports are generated and can be found in the reports/ folder.

Contributing

To contribute:

Fork the repository.

Create a new branch (feature-branch-name).

Commit your changes (git commit -m "Description of changes").

Push to the branch (git push origin feature-branch-name).

Open a Pull Request.

Contact

For any inquiries, please reach out to the project maintainers.

Happy Testing! 🚀

