public class BonusEmployee extends Employee {
    private double bonus;

    public BonusEmployee(String name, String address, int basicSalary, double bonus) {
        super(name, address, basicSalary);
        this.bonus = bonus;
    }

    public double getMonthlySalary() {
        return ((double) basicSalary / 12) + bonus;
    }
}
