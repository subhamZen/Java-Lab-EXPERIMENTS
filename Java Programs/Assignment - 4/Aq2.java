import java.util.Scanner;

class Aq2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        float a, b;

        System.out.print("Enter 1st no.: ");
        a = sc.nextFloat();

        System.out.print("Enter 2nd no.: ");
        b = sc.nextFloat();

        int n1 = (int) (a * 1000);
        int n2 = (int) (b * 1000);

        if (n1 == n2) {
            System.out.println("The numbers are same upto 3 decimal places.");
        }
        else {
            System.out.println("The numbers are different.");
        }

        sc.close();
    }
}