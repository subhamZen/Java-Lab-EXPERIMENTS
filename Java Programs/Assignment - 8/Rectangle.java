class Rectangle {
    double width;
    double height;

    Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    double area() {
        return width * height;
    }

    double perimeter() {
        return 2 * (width + height);
    }

    public static void main(String args[]) {
        Rectangle r1 = new Rectangle(10, 5);

        System.out.println("Area = " + r1.area());
        System.out.println("Perimeter = " + r1.perimeter());
    }
}