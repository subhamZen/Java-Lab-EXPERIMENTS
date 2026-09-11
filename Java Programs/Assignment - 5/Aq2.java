import java.lang.*;

class Aq2 {
    public static void main(String args[]) {
        double e = 1.0;
        int fact = 1;

        for (int i = 1; i <= 5; i++) {
            fact = fact * i;
            e = e + 1.0 / fact;
        }

        System.out.printf("Value of e = %.6f", e);
    }
}