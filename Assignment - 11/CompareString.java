import java.util.Scanner;

class CompareString
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String 1: ");
        String s1 = sc.nextLine();

        System.out.print("Enter String 2: ");
        String s2 = sc.nextLine();

        int n = s1.length();
        int m = s2.length();
        int result = 0;

        int min = n;
        if(m < min)
            min = m;

        for(int i = 0; i < min; i++)
        {
            if(s1.charAt(i) < s2.charAt(i))
            {
                result = -1;
                break;
            }
            else if(s1.charAt(i) > s2.charAt(i))
            {
                result = 1;
                break;
            }
        }

        if(result == 0)
        {
            if(n < m)
                result = -1;
            else if(n > m)
                result = 1;
        }

        if(result == 0)
            System.out.println("Both strings are equal");
        else if(result < 0)
            System.out.println("\"" + s1 + "\" is less than \"" + s2 + "\"");
        else
            System.out.println("\"" + s1 + "\" is greater than \"" + s2 + "\"");
    }
}