/*
Program to print Fibonacci series - 
*/
import java.util.*;
import java.io.*;
public class FibbDemo{
	public static void main (String[] args) throws Exception{
	    	Scanner scan = new Scanner(System.in);
		int x;
		
		System.out.println("Enter the number of entries you want");
		int n = scan.nextInt();
		
		if(n>=2) {
			System.out.print("0 1 ");
			//second and third argument is the first two digits of the fibonacci series
			printSeries(n,0,1,0);
		}
		else if(n==1) {
			System.out.println("0");
		}
		else {
 			System.out.println("Invalid entry");
		}

	}
	//algorithm for fibonacci series - will only be called if n>2
	public static void printSeries(int n, long a, long b, long temp){
		int i;
		for(i=2;i<n;i++){
			temp = a+b;
			System.out.print(temp+" ");
			a=b;
			b=temp;	
		}
	}
}
