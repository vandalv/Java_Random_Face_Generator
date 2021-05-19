//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.Duration;
import java.time.Instant;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws NoSuchFieldException, IOException {
        long timeElapsed = 0L;
        long timeElapsedAL = 0L;
        long timeElapsedLL = 0L;
        int n = 10;
        EmployeesL empL = new EmployeesL();
        EmployeesAr empAr = new EmployeesAr();
        new EmployeesL();

        int i;
        for(i = 0; i < 5; ++i) {
            Employee createdPerson = new Employee();
            createdPerson.setId(createdPerson.randId(100000000L, 999999999L));
            createdPerson.setName(createdPerson.randomName());
            createdPerson.setSurname(createdPerson.randomSurame());
            createdPerson.setBirthDate(createdPerson.birthDateGen());
            createdPerson.setEmploymentDate(createdPerson.employmentDate());
            createdPerson.setSalary(createdPerson.randSalary());
            createdPerson.setJobTitle(createdPerson.randomJobtitle());
            createdPerson.createGraphics();
            empL.personArrayList.add(createdPerson);
            empL.personLinkedList.add(createdPerson);
            EmployeesAr.employeeArray[i] = createdPerson;
        }

        Instant llfinish;
        Instant llstart;
        for(i = 0; i < n; ++i) {
            llstart = Instant.now();
            empL.sortAscSalaryArrayList();
            empL.sortAscEmploymentDateArrayList();
            llfinish = Instant.now();
            timeElapsed = Duration.between(llstart, llfinish).toMillis();
            timeElapsedAL += timeElapsed;
        }

        for(i = 0; i < n; ++i) {
            llstart = Instant.now();
            empL.sortAscSalaryLinkedList();
            empL.sortAscEmploymentDateLinkedList();
            llfinish = Instant.now();
            timeElapsed = Duration.between(llstart, llfinish).toMillis();
            timeElapsedLL += timeElapsed;
        }

        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employeesAL.dat"));

            try {
                out.writeObject(empL);
            } catch (Throwable var18) {
                try {
                    out.close();
                } catch (Throwable var17) {
                    var18.addSuppressed(var17);
                }

                throw var18;
            }

            out.close();
        } catch (IOException var19) {
            var19.printStackTrace();
        }

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("employeesAL.dat"));

            try {
                EmployeesL var10 = (EmployeesL)in.readObject();
            } catch (Throwable var15) {
                try {
                    in.close();
                } catch (Throwable var14) {
                    var15.addSuppressed(var14);
                }

                throw var15;
            }

            in.close();
        } catch (ClassNotFoundException | IOException var16) {
            var16.printStackTrace();
        }

        for(i = 0; i < EmployeesAr.employeeArray.length; ++i) {
            if (EmployeesAr.employeeArray[i] != null) {
                System.out.print(EmployeesAr.employeeArray[i]);
            }
        }

        new MyFrame();
    }
}
