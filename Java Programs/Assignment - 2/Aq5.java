import java.lang.*;
class Aq5{
	public static void main(String args[]){
		int min = 1000000;
		int d,y,r;
		
		d = min/(60*24);
		y = d/365;
		r = d%365;
		
		System.out.println("Minuts = "+min);
		System.out.println("Years = "+y);
		System.out.println("Days = "+r);
	}
}