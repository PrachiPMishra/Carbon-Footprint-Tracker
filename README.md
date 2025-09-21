# Carbon-Footprint-Tracker
A Spring Boot REST API to help users track their daily activities (travel, food, energy usage) and calculate their estimated carbon footprint.

## Features
- User-friendly REST API to record activities (travel, food, energy)
- Calculates CO₂ emissions instantly using configurable emission factors
- Stores activity history for each user
- Easy to extend with authentication, reporting, or a front-end UI

## Tech Stack
- **Spring Boot** – REST API framework
- **Spring Data JPA** – ORM for database access
- **H2 Database** (default, in-memory) – for quick testing
- **Maven** – build tool

## Project Structure
src/
└── main/java/com/example/carbontracker
├── model/
│ ├── Activity.java
│ └── ActivityType.java
├── repository/
│ └── ActivityRepository.java
├── service/
│ └── CarbonCalculatorService.java
└── controller/
└── ActivityController.java
└── main/resources/
└── application.properties
