//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.Serializable;
import java.util.Arrays;

public class EmployeesAr extends Employees implements Serializable {
    static Employee[] employeeArray = new Employee[100];

    public EmployeesAr() {
    }

    public static Employee[] getArray() {
        return employeeArray;
    }

    public String toString() {
        return Arrays.toString(employeeArray);
    }
}
