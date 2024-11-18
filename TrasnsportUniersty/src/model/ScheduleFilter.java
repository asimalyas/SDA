/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class ScheduleFilter implements Filter {
    @Override
    public boolean apply(TransportOption transportOption) {
        if (transportOption.getName().contains("University")) {
            System.out.println("Schedule Filter: Timing restrictions applied.");
            return false;
        }
        System.out.println("Schedule Filter: No timing restrictions.");
        return true;
    }
}

