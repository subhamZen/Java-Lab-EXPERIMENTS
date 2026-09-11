import java.util.*;
class Aq5{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double CP, SP, P, L, per;

		System.out.println("Enter cost price :  ");
		CP = sc.nextDouble();
		
		System.out.println("Enter selling price :  ");
		SP = sc.nextDouble();

		if(SP > CP){
			P = SP - CP;
			per = (P * 100) / CP;
			System.out.println("Profit = " + P);
			System.out.println("Profit Percentage = " + per + "%");
		}
		else if(SP < CP){
			L = CP - SP;
			per = (L * 100) / CP;
			System.out.println("Loss = " + L);
			System.out.println("Loss Percentage = " + per + "%");
		}
		else{
			System.out.println("No profit & No Loss");
		}
		sc.close();
	}
}