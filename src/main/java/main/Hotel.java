package main;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    List<Room> rooms;

    public Hotel() {
        rooms = new ArrayList<Room>();
        for (int i = 0; i < 50; i++) {
            rooms.add(new Room(i));
        }
    }
}