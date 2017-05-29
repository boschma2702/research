package main;

import employee.Boss;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    List<Room> rooms;
    List<Employee> employees;
    Boss boss;

    public Hotel() {
        rooms = new ArrayList<Room>();
        for (int i = 0; i < 50; i++) {
            rooms.add(new Room(i));
        }

        boss = new Boss("Bob", "Ross", 0);

        employees = new ArrayList<Employee>();
        for (int i = 1; i < 10; i++) {
            employees.add(new Employee("first" + i, "last" + i, i));
        }

    }
}
