/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentation;

public class MainUI implements TransportObserver {
    @Override
    public void update() {
        System.out.println("Transport option updated. Refreshing UI...");
    }

    public void showOptions() {
        System.out.println("Choose your transportation option: ");
        System.out.println("1. Public Transport");
        System.out.println("2. Personal Vehicle");
        System.out.println("3. University Transport Service");
    }
}

