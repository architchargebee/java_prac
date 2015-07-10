//Print the smallest and largest number in an integer array.
import java.util.Scanner;
import java.util.Arrays;

public class LargeSmall{
	public static void main (String[] args) throws Exception{
	    	Scanner scan = new Scanner(System.in);
		int n,i;
		System.out.print("Enter the number of elements: ");
		n= scan.nextInt();
		System.out.println("Enter "+n+" array elements separated by a comma: ");
		int[] arr=new int[n];
		input(arr, n);
		sort(arr, n);
	}
	//for input and its validation	
	public static int[] input(int[] arr, int n) {
		int j;
		Scanner scan = new Scanner(System.in);
		String s   = scan.nextLine(); 
		String[] result = s.split(",");
		if(result.length != n) {
			System.out.println("Invalid entry");
			System.exit(0);
		}
    		for(j=0; j<n; j++) {
       			arr[j] = Integer.parseInt(result[j]);
		}
		return arr;
	}
	//Bubble sort for sorting a one dimensional array
	public static void sort(int[] arr, int n) {
		int i,j,tmp;
		for(i=1;i<n;i++) {
			for(j=0;j<(n-i);j++) {
				if(arr[j]>arr[j+1]){
					tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
		System.out.println("Min: "+ arr[0]+"\t Max: " + arr[n-1]);
	}
		
}
