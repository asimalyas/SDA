/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import model.TripInfo;

public class ValidationFilter implements Filter {
    private TripInfo trip;

    public ValidationFilter(TripInfo trip) {
        this.trip = trip;
    }

    @Override
    public void process() {
        if (trip.getCapacity() > 0) {
            System.out.println("Validation successful: Seats are available.");
        } else {
            System.out.println("Validation failed: No seats available.");
        }
    }
}
