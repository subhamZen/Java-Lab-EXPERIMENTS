import java.lang.*;
class Aq3 {
    public static void main(String[] args) {

        int a[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        int max = a[0];
        int min = a[0];

        for (int i = 1; i < a.length; i++) {

            if (a[i] > max) {
                max = a[i];
            }

            if (a[i] < min) {
                min = a[i];
            }
        }

        System.out.println("Maximum value for the above array = " + max);
        System.out.println("Minimum value for the above array = " + min);
    }
}