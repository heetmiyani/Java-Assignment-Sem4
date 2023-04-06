public abstract class Employee {
    private String name;
    private String address;
    protected int basicSalary;

    public Employee(String name, String address, int basicSalary) {
        this.name = name;
        this.address = address;
        this.basicSalary = basicSalary;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public abstract double getMonthlySalary();
}



