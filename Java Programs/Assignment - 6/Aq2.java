import java.lang.*;
class Aq2 {
    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }

        double average = (double) sum / a.length;

        System.out.println("The average of array elements is " + average);
    }
}