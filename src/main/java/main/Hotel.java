package main;

import employee.Manager;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    List<Room> rooms;
    List<Employee> employees;
    Manager manager;

    public Hotel() {
        rooms = new ArrayList<Room>();
        for (int i = 0; i < 50; i++) {
            rooms.add(new Room(i));
        }

        manager = new Manager("Bob", "Ross", 0);

        employees = new ArrayList<Employee>();
        for (int i = 1; i < 10; i++) {
            employees.add(new Employee("first" + i, "last" + i, i));
        }
        
    }
}
