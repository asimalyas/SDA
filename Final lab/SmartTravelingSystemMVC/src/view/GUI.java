/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.Controller;
import model.User;
import model.TripInfo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class GUI{
    private JFrame frame;
    private JComboBox<String> tripComboBox;
    private JButton reserveButton;
    private JTextArea statusArea;
    private Controller controller;

    public GUI(Controller controller) {
        this.controller = controller;
        initialize();
    }

    // Initialize the GUI components
    private void initialize() {
        // Create main frame
        frame = new JFrame("Smart Traveling System");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center the window

        // Set layout for the frame
        frame.setLayout(new BorderLayout());

        // Create top panel for instructions and combo box
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout());
        topPanel.setBackground(new Color(72, 61, 139)); // Dark Slate Blue

        // Label for instructions
        JLabel label = new JLabel("Select a Trip and Reserve a Seat:");
        label.setFont(new Font("Arial", Font.PLAIN, 16));
        label.setForeground(Color.WHITE);

        // ComboBox for trip selection
        tripComboBox = new JComboBox<>();
        updateTripComboBox();
        tripComboBox.setPreferredSize(new Dimension(200, 30));

        // Add components to top panel
        topPanel.add(label);
        topPanel.add(tripComboBox);

        // Create center panel for status display
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());
        statusArea = new JTextArea(5, 30);
        statusArea.setEditable(false);
        statusArea.setFont(new Font("Arial", Font.PLAIN, 14));
        statusArea.setBackground(new Color(240, 248, 255)); // Light Blue

        JScrollPane scrollPane = new JScrollPane(statusArea);
        centerPanel.add(scrollPane, BorderLayout.CENTER);

        // Create bottom panel for reservation button
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout());
        reserveButton = new JButton("Reserve Seat");
        reserveButton.setBackground(new Color(34, 139, 34)); // Forest Green
        reserveButton.setFont(new Font("Arial", Font.BOLD, 14));
        reserveButton.setForeground(Color.WHITE);

        bottomPanel.add(reserveButton);

        // Add panels to frame
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(centerPanel, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        // Add action listener to reserve button
        reserveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get selected trip
                String selectedTripName = (String) tripComboBox.getSelectedItem();
                TripInfo selectedTrip = getTripByName(selectedTripName);

                if (selectedTrip != null) {
                    User user = new User("John Doe", 101);  // Hardcoded user for now, can be extended
                    controller.processReserveRequest(user, selectedTrip);
                    statusArea.setText("Seat Reserved for " + user.getName() + " on " + selectedTrip.getName());
                    updateTripComboBox(); // Update available trips after reservation
                } else {
                    statusArea.setText("No available trips to reserve.");
                }
            }
        });

        // Display the frame
        frame.setVisible(true);
    }

    // Update the trip combo box with current available trips
    private void updateTripComboBox() {
        tripComboBox.removeAllItems();
        List<TripInfo> trips = controller.getTrips();
        for (TripInfo trip : trips) {
            if (trip.getCapacity() > 0) {
                tripComboBox.addItem(trip.getName() + " - " + trip.getDate() + " - Available Seats: " + trip.getCapacity());
            }
        }
    }

    // Get TripInfo by name (assuming unique trip names)
    private TripInfo getTripByName(String tripName) {
        for (TripInfo trip : controller.getTrips()) {
            if ((trip.getName() + " - " + trip.getDate() + " - Available Seats: " + trip.getCapacity()).equals(tripName)) {
                return trip;
            }
        }
        return null;
    }
}
