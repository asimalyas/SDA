/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class User {
    private String name;
    private int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String checkSchedule() {
        return "Trip to Paris on 20th March 2025. Available Seats: 5";
    }

    public void reserveSeat(TripInfo trip) {
        if (trip.getCapacity() > 0 && "Available".equals(trip.getStatus())) {
            System.out.println("Seat reserved for " + name + " on " + trip.getName());
            trip.reduceCapacity();
        } else {
            System.out.println("No seats available or trip is not available.");
        }
    }
}
