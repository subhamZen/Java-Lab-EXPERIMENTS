import java.util.*;
class Aq3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		 int PR, CR, TC;
		double bill;

		System.out.println("Enter previous reading :");
		PR = sc.nextInt();
		
		System.out.println("Enter current reading :");
		CR = sc.nextInt();

		TC = CR - PR;
		if(TC <= 100){
			bill = TC * 3;
		}
		else if(TC <= 500){
			bill = (100 * 3) +( (TC - 100) * 4);
		}
		else{
			bill = (100 * 3) + (400 * 4) + ((TC - 500) * 6);
		}
		System.out.println("Total Consumption = " + TC + " Units");
		System.out.println("Electricity Bill :" + bill);
		
		sc.close();
	}
}

