/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class PaymentFilter implements Filter {
    @Override
    public boolean apply(TransportOption transportOption) {
        if (transportOption.getCost() > 5.0) {
            System.out.println("Payment Filter: High cost");
            return false;
        }
        System.out.println("Payment Filter: Cost within acceptable range.");
        return true;
    }
}

