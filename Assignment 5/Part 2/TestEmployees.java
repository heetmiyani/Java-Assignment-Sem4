public class TestEmployees {
    public static void main(String[] args) {
        Employee employee1 = new NormalEmployee("John Doe", "123 Main St", 60000);
        Employee employee2 = new BonusEmployee("Jane Smith", "456 Oak St", 80000, 5000);

        System.out.println(employee1.getName() + " earns $" + employee1.getMonthlySalary() + " per month");
        System.out.println(employee2.getName() + " earns $" + employee2.getMonthlySalary() + " per month");
    }
}
