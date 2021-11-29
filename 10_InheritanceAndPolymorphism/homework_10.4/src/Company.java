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

    protected int getIncome() { //значение дохода компании

        return 100000011 ;
    }
    protected int getTopManagerPercent(){
        return (int) 1.5;
    }
    protected double getManagerPercent(){
        return 0.5;
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
    protected static void hireEmployees(Company company) {
        for (int i = 0; i < 180; i++) {
            Employee operator = new Operator(company);
            company.hire(operator);
        }
        for (int i = 0; i < 80; i++) {
            Employee manager = new Manager(company);
            company.hire(manager);
        }
        for (int i = 0; i < 10; i++) {
            Employee topManager = new TopManager(company);
            company.hire(topManager);
        }
        System.out.println("Добавлено сотрудников компании: " + company.countEmployees());

    }
    protected static void fireHalfEmployees(Company company) {
        int countEmployees = company.countEmployees();
        for (int i = 0; i < countEmployees / 2; i++) {
            int index = (int) (Math.random() * company.countEmployees());
            Employee loser = company.getEmployees().get(index);
            company.fire(loser);
        }
        System.out.println("Уволено : " + countEmployees / 2 + " сотрудников");
    }


}

