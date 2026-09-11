import java.util.*;
class Aq4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter a number : ");
		num = sc.nextInt();
		
		if(num > 0){
			System.out.println("Positive Number ");
		}
		else if(num < 0){
			System.out.println("Negative Number ");
		}
		else{
			System.out.println("Zero");
		}
		sc.close();
	}
}