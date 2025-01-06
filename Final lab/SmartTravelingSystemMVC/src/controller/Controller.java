/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.User;
import model.TripInfo;
import utils.Pipe;
import utils.Filter;
import java.util.List;

public class Controller {
    private List<TripInfo> trips;
    private Pipe pipe; // For processing any filters or additional logic (e.g., capacity checks, user validation)

    // Constructor
    public Controller(List<TripInfo> trips, Pipe pipe) {
        this.trips = trips;
        this.pipe = pipe;
    }

    // Method to process a reservation request
    public void processReserveRequest(User user, TripInfo trip) {
        // Apply filters (capacity, user status, etc.)
        pipe.executeFilters();  // Assuming filters are applied here before processing the request

        if (trip.getCapacity() > 0) {
            // If capacity is available, reserve the seat for the user
            user.reserveSeat(trip);
            trip.reduceCapacity(); // Reduce the trip's capacity by 1 after a successful reservation
            System.out.println(user.getName() + " reserved a seat on " + trip.getName() + " for " + trip.getDate());
        } else {
            System.out.println("Sorry, no available seats for this trip.");
        }
    }

    // Method to send updates (e.g., status updates, trip availability, etc.)
    public void sendUpdates() {
        System.out.println("Sending updates to all users.");

        // For demonstration, we can iterate through all trips and show their statuses
        for (TripInfo trip : trips) {
            System.out.println("Trip: " + trip.getName() + " - Status: " + trip.getStatus() + " - Capacity: " + trip.getCapacity());
        }
    }

    // Method to monitor the status of trips and check capacity
    public void monitorTrips() {
        System.out.println("Monitoring all trips:");
        for (TripInfo trip : trips) {
            System.out.println("Trip: " + trip.getName() + " - Date: " + trip.getDate() + " - Remaining Seats: " + trip.getCapacity());
        }
    }

    // Method to add a new trip to the list
    public void addTrip(TripInfo trip) {
        trips.add(trip);
        System.out.println("New trip added: " + trip.getName() + " on " + trip.getDate());
    }

    // Get all trips
    public List<TripInfo> getTrips() {
        return trips;
    }

    // Set all trips
    public void setTrips(List<TripInfo> trips) {
        this.trips = trips;
    }
}


