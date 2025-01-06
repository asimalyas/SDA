/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class TripInfo {
    private String name;
    private String date;
    private int capacity;
    private String status;

    // Constructor
    public TripInfo(String name, String date, int capacity, String status) {
        this.name = name;
        this.date = date;
        this.capacity = capacity;
        this.status = status;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for date
    public String getDate() {
        return date;
    }

    // Getter for capacity
    public int getCapacity() {
        return capacity;
    }

    // Getter for status
    public String getStatus() {
        return status;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Setter for date
    public void setDate(String date) {
        this.date = date;
    }

    // Setter for capacity
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    // Setter for status
    public void setStatus(String status) {
        this.status = status;
    }

    // Method to reduce capacity by 1
    public void reduceCapacity() {
        if (capacity > 0) {
            capacity--;  // Decrease the capacity by 1
        } else {
            System.out.println("No more seats available for the trip.");
        }
    }
}
