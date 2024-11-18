/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class PersonalVehicle extends TransportOption {
    public PersonalVehicle() {
        super("Personal Vehicle", 10.0);
    }

    @Override
    public void displayDetails() {
        System.out.println("Personal Vehicle: Flexible schedule, pay as you use.");
    }
}

