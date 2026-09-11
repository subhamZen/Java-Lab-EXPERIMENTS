import java.lang.*;
class Aq4{
	public static void main(String args[]){
		int a  = 50, b = 60;
		System.out.println("Before Swap a="+a+",b="+b);

		a = a^b;
		b=a^b;
		a=a^b;
		System.out.println("After Swap a="+a+",b="+b);
	}
}