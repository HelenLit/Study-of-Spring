package org.example.main;

import org.example.beans.Vehicle;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lesson6 {

    public static void main(String[] args) {

        var context = new ClassPathXmlApplicationContext("beans.xml");
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + vehicle.getName());
    }
}

/*
Vehicle name from Spring Context is: Honda
 */
