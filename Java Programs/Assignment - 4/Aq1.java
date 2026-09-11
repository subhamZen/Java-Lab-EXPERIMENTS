import java.util.Scanner;

class Aq1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        double a, b, c, d, x1, x2;

        System.out.print("Enter 1st value: ");
        a = sc.nextDouble();

        System.out.print("Enter 2nd value: ");
        b = sc.nextDouble();

        System.out.print("Enter 3rd value: ");
        c = sc.nextDouble();

        d = (b * b) - (4 * a * c);

        if (d > 0) {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("Two distinct roots: " + x1 + " and " + x2);
        }
        else if (d == 0) {
            x1 = -b / (2 * a);

            System.out.println("Roots are same: " + x1);
        }
        else {
            System.out.println("Roots are imaginary");
        }

        sc.close();
    }
}
		