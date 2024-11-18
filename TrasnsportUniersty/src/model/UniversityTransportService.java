/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class UniversityTransportService extends TransportOption {
    public UniversityTransportService() {
        super("University Transport", 5.0);
    }

    @Override
    public void displayDetails() {
        System.out.println("University Transport Service: Prepaid, timing restrictions.");
    }
}

