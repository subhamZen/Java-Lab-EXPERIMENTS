import java.util.Scanner;

class SecondFrequent
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int max1 = 0;
        int max2 = 0;
        char first = ' ';
        char second = ' ';

        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            int count = 0;

            for(int j = 0; j < s.length(); j++)
            {
                if(s.charAt(j) == ch)
                    count++;
            }

            if(count > max1)
            {
                max2 = max1;
                second = first;

                max1 = count;
                first = ch;
            }
            else if(count > max2 && ch != first)
            {
                max2 = count;
                second = ch;
            }
        }

        if(max2 == 0)
            System.out.println("No second most frequent character");
        else
            System.out.println("Second most frequent character: " + second);
    }
}