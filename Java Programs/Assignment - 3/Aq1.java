import java.util.*;
class Aq1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int s1,s2,s3,s4,s5;
		int total;
		double per;
		
		System.out.println("Enter 1st subject mark : ");
		s1 = sc.nextInt();

		System.out.println("Enter 2nd subject mark : ");
		s2 = sc.nextInt();

		System.out.println("Enter 3rd subject mark : ");
		s3 = sc.nextInt();

		System.out.println("Enter 4th subject mark : ");
		s4 = sc.nextInt();

		System.out.println("Enter 5th subject mark : ");
		s5 = sc.nextInt();

		total = s1 + s2 + s3 + s4 + s5;
		per = (total / 500.0) * 100;
		System.out.println("Total = " + total);
		System.out.println("Percentage = " + per);
		
		sc.close();
	}
}