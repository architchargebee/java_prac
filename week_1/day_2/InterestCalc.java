/*
 * Java program to calculate Simple Interest and Compound Interest
 * Input to program is principle, rate and time and output is simple iInterest and Compound Interest 
 * 
 */
import java.util.*;
import java.io.*;
public class InterestCalc{
	public static void main(String args[]) {
     
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter principle, rate(annual) and time");
  
		double amount = scanner.nextDouble();
		double time = scanner.nextDouble();
		double rate = scanner.nextDouble();
		double simple_interest = simpleInterest(amount, rate, time);
		double compound_interest = compoundInterest(amount, rate, time);
     
		System.out.println("Simple interest " + simple_interest);
		System.out.format("Compound interst %.2f%n",compound_interest);
	}
 	//Algorithm to calculate simple interest
	public static double simpleInterest(double principle, double rate, double time){
		double interest = (principle*rate*time)/100;
		return interest;
	}
	//Algorithm to calculate Compound interest
	public static double compoundInterest(double principle, double rate, double time) {
		double amount = principle * Math.pow(1 + (rate / 100), time);
		double interest = amount - principle;
		return interest;
        
    	}
	
	
}



