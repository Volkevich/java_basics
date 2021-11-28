public class Main {
    public static void main(String[] args) {
        Company CocaCola = new Company();
        hireEmployees(CocaCola);
        printLowestSalaries(CocaCola);
        printHighSalaries(CocaCola);
        fireHalfEmployees(CocaCola);
        printSalariesOperator(CocaCola);




    }
    public static void printSalariesOperator(Company company) {
        System.out.println("Зарплата Оператора: ");
        Employee operator = new Operator(company);
        System.out.println(operator.getSalary());
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

    private static void hireEmployees(Company company) {
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

    private static void fireHalfEmployees(Company company) {
        int countEmployees = company.countEmployees();
        for (int i = 0; i < countEmployees / 2; i++) {
            int index = (int) (Math.random() * company.countEmployees());
            Employee loser = company.getEmployees().get(index);
            company.fire(loser);
        }
        System.out.println("Уволено : " + countEmployees / 2 + " сотрудников");
    }


}
