/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class PublicTransport extends TransportOption {
    public PublicTransport() {
        super("Public Transport", 2.5);
    }

    @Override
    public void displayDetails() {
        System.out.println("Public Transport: Pay on the spot, waiting time involved.");
    }
}

