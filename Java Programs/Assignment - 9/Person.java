class Person {

    String firstName;
    String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    public static void main(String args[]) {
        Employee e = new Employee(
            "Subham", "Mahankuda", 104, "Software Engineer"
        );

        System.out.println("Name: " + e.getFirstName()+" "+e.getLastName());
        System.out.println("Employee ID: " + e.getEmployeeId());
    }
}

class Employee extends Person {

    int employeeId;
    String jobTitle;

    Employee(String firstName, String lastName,
             int employeeId, String jobTitle) {

        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    int getEmployeeId() {
        return employeeId;
    }

    
    String getLastName() {
        return lastName + " (" + jobTitle + ")";
    }
}