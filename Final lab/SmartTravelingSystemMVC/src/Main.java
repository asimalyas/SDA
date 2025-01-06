/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



import controller.Controller;
import model.User;
import model.TripInfo;
import utils.Pipe;
import utils.Filter;
import view.GUI;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create some trips
        TripInfo trip1 = new TripInfo("Mountain Trip", "2025-01-07", 5, "Available");
        TripInfo trip2 = new TripInfo("Beach Trip", "2025-01-10", 3, "Available");

        // Create a list of trips
        List<TripInfo> trips = new ArrayList<>();
        trips.add(trip1);
        trips.add(trip2);

        // Create a filter and pipe
        Filter filter = new Filter() {
            @Override
            public void process() {
                System.out.println("Processing filter...");
            }
        };
        List<Filter> filters = new ArrayList<>();
        filters.add(filter);
        Pipe pipe = new Pipe(filters);

        // Create a controller
        Controller controller = new Controller(trips, pipe);

        // Create and display the GUI
        new GUI(controller);
    }
}
