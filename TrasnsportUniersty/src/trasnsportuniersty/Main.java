/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trasnsportuniersty;


import service.TransportationService;
import access.TransportationAccess;
import model.TransportOption;
import model.ScheduleFilter;
import model.PaymentFilter;
import model.FlexibilityFilter;
import presentation.MainUI;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Initialize the UI and service
        MainUI ui = new MainUI();
        TransportationService service = new TransportationService();
        service.addObserver(ui);

        // Display options
        ui.showOptions();

        // Access layer to retrieve transport options
        TransportationAccess access = new TransportationAccess();
        TransportOption publicTransport = access.getTransportOption("Public Transport");
        TransportOption personalVehicle = access.getTransportOption("Personal Vehicle");
        TransportOption universityTransport = access.getTransportOption("University Transport");

        // Example: Select an option and apply filters
        service.selectTransportOption(publicTransport);
        service.applyFilters(Arrays.asList(new ScheduleFilter(), new PaymentFilter(), new FlexibilityFilter()));
        
        System.out.println("\nTrying another option...\n");
        
        service.selectTransportOption(personalVehicle);
        service.applyFilters(Arrays.asList(new ScheduleFilter(), new PaymentFilter(), new FlexibilityFilter()));
         System.out.println("\nTrying another option...\n");
        service.selectTransportOption(universityTransport);
        service.applyFilters(Arrays.asList(new ScheduleFilter(), new PaymentFilter(), new FlexibilityFilter()));

    }
}
