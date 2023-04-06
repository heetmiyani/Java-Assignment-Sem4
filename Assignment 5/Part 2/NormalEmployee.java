public class NormalEmployee extends Employee {
    public NormalEmployee(String name, String address, int basicSalary) {
        super(name, address, basicSalary);
    }

    public double getMonthlySalary() {
        return (double) basicSalary / 12;
    }
}