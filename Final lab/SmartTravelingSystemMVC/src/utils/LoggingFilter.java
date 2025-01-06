/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import model.TripInfo;
import model.User;

public class LoggingFilter implements Filter {
    private TripInfo trip;
    private User user;

    public LoggingFilter(TripInfo trip, User user) {
        this.trip = trip;
        this.user = user;
    }

    @Override
    public void process() {
        System.out.println("Logging: User " + user.getName() + " (ID: " + user.getId() + ") reserved a seat on trip " 
            + trip.getName() + " on " + trip.getDate());
    }
}

