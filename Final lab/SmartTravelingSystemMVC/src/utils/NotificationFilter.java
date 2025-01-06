/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import model.User;

public class NotificationFilter implements Filter {
    private User user;

    public NotificationFilter(User user) {
        this.user = user;
    }

    @Override
    public void process() {
        // Simulate sending a notification
        System.out.println("Notification sent to " + user.getName() + ": Your seat has been reserved.");
    }
}
