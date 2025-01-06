/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.List;

public class Pipe {
    private List<Filter> filters;

    public Pipe(List<Filter> filters) {
        this.filters = filters;
    }

    public void executeFilters() {
        System.out.println("Executing filters...");
        for (Filter filter : filters) {
            filter.process();  // Calls process() on each filter
        }
    }
}


