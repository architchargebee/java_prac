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
		input(arr);
		sort(arr);
	}
	//for input and its validation	
	public static int[] input(int[] arr) {
		int j;
		Scanner scan = new Scanner(System.in);
		String s   = scan.nextLine(); 
		String[] result = s.split(",");
		if(result.length != arr.length) {
			System.out.println("Invalid entry");
			System.exit(0);
		}
    		for(j=0; j<arr.length; j++) {
       			arr[j] = Integer.parseInt(result[j]);
		}
		return arr;
	}
	//Bubble sort for sorting a one dimensional array
	public static void sort(int[] arr) {
		int i,j,tmp;
		int min=arr[0],max=arr[0];
		for(i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			if(min>arr[i]) {
				min=arr[i];
			}
		}

		System.out.println("Min: "+ min+"\t Max: " + max);
	}
		
}
