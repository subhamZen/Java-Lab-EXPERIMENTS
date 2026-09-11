import java.lang.*;
class Aq1{
	public static void main(String args[]){
		int num = 456;
		int a,b,c,sum;

		a = num/100;
		b = (num/10)%10;
		c =  num%10;
		
		sum = a+b+c;
		System.out.println("Num ="+num);
		System.out.println("Sum ="+sum);
	}
}