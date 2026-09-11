import java.util.Scanner;

class Aq3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Enter a month no.: ");
        num = sc.nextInt();

        switch (num) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("The month is having 31 days");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("The month is having 30 days");
                break;

            case 2:
                System.out.println("The month is having 28 days");
                break;

            default:
                System.out.println("Invalid month no.");
        }

        sc.close();
    }
}