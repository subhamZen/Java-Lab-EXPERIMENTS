import java.util.Scanner;

class SameString
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String 1: ");
        String s1 = sc.nextLine();

        System.out.print("Enter String 2: ");
        String s2 = sc.nextLine();

        boolean same = true;

        if(s1.length() != s2.length())
        {
            same = false;
        }
        else
        {
            for(int i = 0; i < s1.length(); i++)
            {
                if(s1.charAt(i) != s2.charAt(i))
                {
                    same = false;
                    break;
                }
            }
        }

        if(same)
            System.out.println("Both strings contain same data");
        else
            System.out.println("Both strings do not contain same data");
    }
}