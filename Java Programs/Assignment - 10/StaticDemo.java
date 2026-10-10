class StaticDemo {

    static String college = "GIET University";

    
    static {
        System.out.println("Welcome to GIET University");
    }

   
    static void display() {
        System.out.println("This is a static method");
    }

    void show() {
        System.out.println("Student is studying CSE");
    }

    public static void main(String args[]) {

        System.out.println("College: " + college);

        display();

        StaticDemo sd = new StaticDemo();
        s.show();
    }
}