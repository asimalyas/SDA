# SDA - Smart Traveling System

This project is about **Software Design and Architecture (SDA)**. It demonstrates the **Reserve a Seat** use case in the **Smart Traveling System**. The system incorporates all relevant diagrams (behavioral, class, package, etc.), follows the **MVC architecture**, and adheres to **SOLID** and **GRASP** principles for a scalable and professional design.

---

## Overview: Reserve a Seat Use Case

The **Reserve a Seat** use case allows users to:
1. View available trips.
2. Reserve a seat on a selected trip.
3. Receive real-time updates on trip status.

### Features:
- **Behavioral Diagrams**: Includes sequence diagrams, activity diagrams, and use case diagrams.
- **Structural Diagrams**: Class diagrams and package diagrams.
- **Professional GUI**: User-friendly interface with professional color combinations.
- **Filters**: Implemented using the **Pipe and Filter** architecture.
- **Principles Applied**: SOLID and GRASP principles for maintainable and low-coupled design.

---

## **Architecture Used**

### **MVC Architecture**
- **Model**: Contains business logic and handles data processing (e.g., trips, users, seat reservations).
- **View**: Provides a graphical interface for user interaction.
- **Controller**: Acts as a mediator between Model and View, handling user requests and responses.

### **Pipe and Filter**
- Filters are applied to process trip data before reservation, ensuring the business rules are followed.

---

## **How to Run the Smart Traveling System**

### Steps to Run the Program:
1. **Clone the Repository**:
   ```bash
   git clone <repository-url>
   cd <repository-folder>
