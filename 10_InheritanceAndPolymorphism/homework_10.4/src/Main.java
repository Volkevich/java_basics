import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Company cocaCola = new Company();
        Company.hireEmployees(cocaCola);
        printLowestSalaries(cocaCola);
        printHighSalaries(cocaCola);
        printSalariesOperator(cocaCola);
        Company.fireHalfEmployees(cocaCola);
        printSalariesManager(cocaCola);
        printSalariesTopManager(cocaCola);
        cocaCola.getIncome();




    }
    public static void printSalariesOperator(Company company) {
        System.out.println("Зарплата Оператора: ");
        Employee operator = new Operator(company);
        System.out.println(operator.getSalary());
    }
    public static void printSalariesManager(Company company) {
        System.out.println("Зарплата Менеджера: ");
        Employee manager = new Manager(company);
        System.out.println(manager.getSalary());
    }
    public static void printSalariesTopManager(Company company) {
        System.out.println("Зарплата ТопМенеджера: ");
        Employee topmeneger = new TopManager(company);
        System.out.println(topmeneger.getSalary());
    }


    public static void printLowestSalaries(Company company) {
        System.out.println("Самые низкие зарплаты в компании CocaCola: ");
        for (Employee employee : company.getLowestSalaryStaff(30)) {
            System.out.println(employee.getSalary() + " руб.");
        }
    }

    public static void printHighSalaries(Company company) {
        System.out.println("Самые высокие зарплаты в компании CocaCola: ");
        for (Employee employee : company.getTopSalaryStaff(12)) {
            System.out.println(employee.getSalary()+ " руб.");
        }
    }






}
