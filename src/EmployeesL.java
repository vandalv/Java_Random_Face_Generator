//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

public class EmployeesL extends Employees {
    private static final Comparator<Employee> ascSalary = new Comparator<Employee>() {
        public int compare(Employee e1, Employee e2) {
            return e1.getSalary().compareTo(e2.getSalary());
        }
    };
    private static final Comparator<Employee> ascName = new Comparator<Employee>() {
        public int compare(Employee e1, Employee e2) {
            return e1.getEmploymentDate().compareTo(e2.getEmploymentDate());
        }
    };
    public ArrayList<Employee> personArrayList = new ArrayList();
    public LinkedList<Employee> personLinkedList = new LinkedList();

    public EmployeesL() {
    }

    public void sortAscSalaryArrayList() {
        this.personArrayList.sort(ascSalary);
    }

    public void sortAscEmploymentDateArrayList() {
        this.personArrayList.sort(ascName);
    }

    public void sortAscSalaryLinkedList() {
        this.personLinkedList.sort(ascSalary);
    }

    public void sortAscEmploymentDateLinkedList() {
        this.personLinkedList.sort(ascName);
    }
}
