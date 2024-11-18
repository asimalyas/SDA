/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class FlexibilityFilter implements Filter {
    @Override
    public boolean apply(TransportOption transportOption) {
        if (transportOption.getName().contains("Public")) {
            System.out.println("Flexibility Filter: Limited flexibility due to fixed schedule.");
            return false;
        }
        System.out.println("Flexibility Filter: Flexible schedule.");
        return true;
    }
}

