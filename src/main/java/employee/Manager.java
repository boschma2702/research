package employee;

import main.Employee;

public class Manager extends Employee {


    public Manager(String firstname, String lastname, int employeeId) {
        super("Manager " + firstname, lastname, employeeId);
    }
}
