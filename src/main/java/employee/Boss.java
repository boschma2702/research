package employee;

import main.Employee;

public class Boss extends Employee {


    public Boss(String firstname, String lastname, int employeeId) {
        super("Boss " + firstname, lastname, employeeId);
    }

}
