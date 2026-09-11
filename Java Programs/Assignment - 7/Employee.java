class Employee{
    String name;
    String job;
    double salary;

    Employee(String name, String job, double salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    void calculateSalary(int days) {
        double dailySalary = salary / 30;
        double totalSalary = dailySalary * days;

        System.out.println("Salary for " + days + " days = " + totalSalary);
    }

    void updateSalary(int days) {
        salary = (salary / 30) * days;

        System.out.println("Updated Salary = " + salary);
    }

    public static void main(String args[]) {
        Employee e = new Employee("Subham", "Developer", 30000);

        e.calculateSalary(20);
        e.updateSalary(25);
    }
}