# SDA
This project is about Software Design.all digarmes behavioral class pakage all digamres of serach book

[![Watch the video](https://img.youtube.com/vi/Y-KiLgwJLEU/0.jpg)](https://www.youtube.com/watch?v=Y-KiLgwJLEU)

# Book Search App - MVC in Express.js

This is a simple **MVC-based Express.js** app that allows users to search books by title.

## Watch the Video Tutorial

Learn how to implement **MVC** architecture in **Express.js** using this short 1-minute tutorial:

[![MVC in Express.js - Book Search App](https://img.youtube.com/vi/IIOhnWEF-mg/0.jpg)](https://youtu.be/IIOhnWEF-mg?si=Fbb00PWl4pT6r6EV)

Click the image to watch the video!

# LAB FINAL

# SDA - Smart Traveling System 

This project is about **Software Design and Architecture (SDA)**. It demonstrates the **Reserve a Seat** use case in the **Smart Traveling System**. The system incorporates all relevant diagrams (behavioral, class, package, etc.), follows the **MVC architecture**, and adheres to **SOLID** and **GRASP** principles for a scalable and professional design.

---

## **Overview: Reserve a Seat Use Case**

The **Reserve a Seat** use case allows users to:
1. View available trips.
2. Reserve a seat on a selected trip.
3. Receive real-time updates on trip status.



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
   - Open a terminal or command prompt.
   - Use the following command to clone the repository:
     ```bash
     git clone <repository-url>
     ```
   - Navigate to the project folder:
     ```bash
     cd <repository-folder>
     ```

2. **Open the Project in NetBeans**:
   - Launch **NetBeans IDE**.
   - Go to **File** > **Open Project**.
   - Navigate to the cloned project folder and select the project.

3. **Build the Project**:
   - In NetBeans, right-click on the project in the **Projects** window.
   - Select **Clean and Build** to ensure all dependencies are resolved.

4. **Run the Program**:
   - Locate the `Main.java` file in the `controller` package (or wherever it's located).
   - Right-click on `Main.java` and select **Run File**.
   - The application GUI will launch, displaying the available trips and reservation options.

5. **Test the Features**:
   - View the list of available trips.
   - Select a trip and reserve a seat by clicking the **Reserve** button.
   - Observe updates in trip capacity and the system's success/error messages.

6. **Filters in Action**:
   - Filters validate the reservation request before processing it.
   - If the trip is full or unavailable, the system will notify the user.

7. **Real-Time Updates**:
   - After a successful reservation, updates are sent to all users regarding trip capacity or status changes.

---

## **Principles and Patterns Used**

1. **SOLID Principles**:
   - **Single Responsibility Principle**: Each class handles a single responsibility, such as user management, trip management, or GUI rendering.
   - **Open/Closed Principle**: The system is open for extension (e.g., adding new filters) but closed for modification.
   - **Liskov Substitution Principle**: Interfaces like `Filter` allow consistent substitution with different filter implementations.
   - **Interface Segregation Principle**: Interfaces are lean and focused (e.g., `Filter` interface).
   - **Dependency Inversion Principle**: High-level modules (like `Controller`) depend on abstractions, not concrete implementations.

2. **GRASP Patterns**:
   - **Controller**: Manages the flow between View and Model.
   - **Information Expert**: Classes like `TripInfo` and `User` encapsulate their own data and logic.
   - **Low Coupling**: Classes interact minimally, reducing dependencies.

3. **Pipe and Filter Architecture**:
   - Filters process trip data (e.g., capacity checks, user eligibility).
   - Pipes link filters to create a flexible and reusable processing flow.

