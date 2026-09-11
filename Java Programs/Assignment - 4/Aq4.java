import java.util.Scanner;

class Aq4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        double a, b, c;

        System.out.print("Enter 1st no.: ");
        a = sc.nextDouble();

        System.out.print("Enter 2nd no.: ");
        b = sc.nextDouble();

        System.out.print("Enter 3rd no.: ");
        c = sc.nextDouble();

        if (a > b) {
            if (a > c) {
                System.out.println("A is big");
            }
            else {
                System.out.println("C is big");
            }
        }
        else {
            if (b > c) {
                System.out.println("B is big");
            }
            else {
                System.out.println("C is big");
            }
        }

        sc.close();
    }
}