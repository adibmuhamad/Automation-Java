# Android UI & API Automation Framework

This framework supports automated UI testing for Android APKs and API testing

## Prerequisites

- Java JDK 11+
- Android Studio / Android SDK
- Appium (v2)
- Node.js (for Appium)
- Maven
- Emulator or physical device connected via ADB

---

## Installation & Setup

- Clone the repo
- Install dependencies
  - mvn clean install
- Start appium server
  - appium
- Launch emulator or connect device
- Go to src/main/java/utils/DriverFactory.java
  - Then change the device name with your emulator or physical device name and set platform version
  - Change the android driver url based on your appium server url

## Running Tests

- Run UI Tests
  - Go to src/test/resources/features
  - Open feature you want to test
  - Click Run
- Run API Tests
  - Go to src/test/java/apiTests
  - Open you want to test
  - Click Run
- Run All Tests (UI and API Tests)
  - mvn tests

