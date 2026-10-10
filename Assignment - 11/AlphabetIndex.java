import java.util.Scanner;

class AlphabetIndex
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        for(char ch = 'a'; ch <= 'z'; ch++)
        {
            System.out.print(ch + " : ");

            for(int i = 0; i < s.length(); i++)
            {
                char c = s.charAt(i);

                if(c == ch || c == ch - 32)
                    System.out.print(i + " ");
            }

            System.out.println();
        }
    }
}