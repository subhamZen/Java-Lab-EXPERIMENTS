class Employee {
    String name;
    double salary;
    int id;

    Employee(String n, double s, int i) {
        name = n;
        salary = s;
        id = i;
    }

    int yearsOfService(int joinYear, int currYear) {
        return currYear - joinYear;
    }

    public static void main(String args[]) {
        Employee e1 = new Employee("Subham", 30000, 101);

        System.out.println("Name: " + e1.name);
        System.out.println("Salary: " + e1.salary);
        System.out.println("ID: " + e1.id);
        System.out.println("Years of Service: " + e1.yearsOfService(2022, 2026));
    }
}