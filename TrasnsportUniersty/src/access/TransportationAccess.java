/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package access;

import model.TransportOption;
import model.PublicTransport;
import model.PersonalVehicle;
import model.UniversityTransportService;

public class TransportationAccess {
    public TransportOption getTransportOption(String type) {
        switch (type) {
            case "Public Transport":
                return new PublicTransport();
            case "Personal Vehicle":
                return new PersonalVehicle();
            case "University Transport":
                return new UniversityTransportService();
            default:
                throw new IllegalArgumentException("Invalid transport type");
        }
    }
}

