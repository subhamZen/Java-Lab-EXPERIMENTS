class Circle {
    double radius;

    double area() {
        return Math.PI * radius * radius;
    }

    double circumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String args[]) {
        Circle c1 = new Circle();

        c1.radius = 5;

        System.out.println("Radius: " + c1.radius);
        System.out.printf("Area: %.2f%n", c1.area());
        System.out.printf("Circumference: %.2f%n", c1.circumference());

        c1.radius = 7;

        System.out.println("New Radius: " + c1.radius);
        System.out.printf("New Area: %.2f%n", c1.area());
        System.out.printf("New Circumference: %.2f%n", c1.circumference());
    }
}