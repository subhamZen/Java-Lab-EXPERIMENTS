import java.util.*;
class Aq2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double BS, HRA, DA, GS;
		System.out.println("Enter basic salary : ");
		BS = sc.nextDouble();
		
		HRA = BS * 10 / 100;
		DA = BS * 60 / 100;
		GS = BS + HRA + DA;
		System.out.println("Basic salary = " + BS);
		System.out.println("HRA = " + HRA);
		System.out.println("DA = " + DA);
		System.out.println("Gross Salary = " + GS);
		
		sc.close();
	}
}
