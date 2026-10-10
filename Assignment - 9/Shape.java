class Shape {

    double getPerimeter() {
        return 0;
    }

    double getArea() {
        return 0;
    }

    public static void main(String args[]) {
        Circle c = new Circle(5);

        System.out.printf("Area = %.2f" , c.getArea());
	System.out.println();
        System.out.printf("Perimeter = %.2f" , c.getPerimeter());
    }
}

class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }
}