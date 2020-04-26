package hw;

import hw.Employee;
import hw.OldComparrator;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        List<Employee> str = new ArrayList<>(Employee.employeeGenerator(4));
        str.sort(new OldComparrator());
        System.out.println(str);

    }
}
