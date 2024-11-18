/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.TransportOption;
import model.Filter;
import presentation.TransportObserver;
import java.util.ArrayList;
import java.util.List;

public class TransportationService {
    private List<TransportObserver> observers = new ArrayList<>();
    private TransportOption selectedOption;

    public void addObserver(TransportObserver observer) {
        observers.add(observer);
    }

    private void notifyObservers() {
        for (TransportObserver observer : observers) {
            observer.update();
        }
    }

    public void selectTransportOption(TransportOption option) {
        selectedOption = option;
        System.out.println("Selected: " + option.getName());
        notifyObservers();
    }

    public void applyFilters(List<Filter> filters) {
        if (selectedOption != null) {
            for (Filter filter : filters) {
                if (!filter.apply(selectedOption)) {
                    System.out.println("Filter failed for: " + filter.getClass().getSimpleName());
                    return;
                }
            }
            System.out.println("All filters passed.");
        } else {
            System.out.println("No transport option selected.");
        }
    }
}

