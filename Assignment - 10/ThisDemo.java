class ThisDemo {

    int roll;
    String name;

    
    ThisDemo() {
        this(104, "Subham");   
    }

    ThisDemo(int roll, String name) {
        this.roll = roll;     
        this.name = name;

        this.display();        
    }

    void display() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
    }

    public static void main(String args[]) {
        ThisDemo td = new ThisDemo();
    }
}