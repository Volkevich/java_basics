import org.apache.commons.collections.list.TreeList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.reverseOrder;

public class Main {

    public static final String STAFF_TXT = "data/staff.txt";

    public static void main(String[] args) {
        List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
        sortBySalaryAndAlphabet(staff);


    }

    public static void sortBySalaryAndAlphabet(List<Employee> staff) {
        staff.sort(Comparator.comparing(Employee::getName));
        staff.sort(Comparator.comparingInt(Employee::getSalary));

        for (Employee employee : staff) {
            System.out.println(employee);
        }

    }
    //TODO Метод должен отсортировать сотрудников по заработной плате и алфавиту.
}
