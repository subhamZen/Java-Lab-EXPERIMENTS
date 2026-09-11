import java.util.*;

class Student {
    String name;
    int rollNo;
    String course;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void chooseCourse() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Available Courses:");
        System.out.println("1. Java");
        System.out.println("2. Python");
        System.out.println("3. C");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1)
            course = "Java";
        else if (choice == 2)
            course = "Python";
        else if (choice == 3)
            course = "C";
        else
            course = "Invalid Course";
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }

    public static void main(String args[]) {
        Student s = new Student("Subham", 104);

        s.chooseCourse();
        s.display();
    }
}