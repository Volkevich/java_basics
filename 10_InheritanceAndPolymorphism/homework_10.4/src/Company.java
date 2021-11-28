import java.util.*;

public class Company {
    private final List<Employee> employees = new ArrayList<>(); //список сотрудников


    protected void hire(Employee employeOne) { // найм одного сотрудника
        this.employees.add(employeOne);
    }

    protected void hireAll(Collection<Employee> employAll) { // принять на работу список сотрудников
        this.employees.addAll(employAll);
    }

    protected void fire(Employee employee) { //увольнения сотрудников
        this.employees.remove(employee);
    }

    protected static int getIncome() { //значение дохода компании
        return 0;
    }

    protected List<Employee> getFilteredLimitedList(int count, Comparator<Employee> employeeComparator) {
        List<Employee> employeeListCopy = new ArrayList<>(employees);
        Collections.sort(employeeListCopy, employeeComparator);
        List<Employee> employeesResult = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            employeesResult.add(employeeListCopy.get(i));
        }
        return employeesResult;
    }

    protected List<Employee> getTopSalaryStaff(int count) {
        return getFilteredLimitedList(count, (o1, o2) -> o2.getSalary() - o1.getSalary());
    }

    protected List<Employee> getLowestSalaryStaff(int count) {
        return getFilteredLimitedList(count, Comparator.comparingInt(Employee::getSalary));
    }
    protected int getSalaryOperator() {
        return Staff.FIX_SALARY;
    }


    protected int countEmployees() {
        return employees.size();
    }
    protected List<Employee> getEmployees(){
        return employees;
    }


}

