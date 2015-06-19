import java.util.Scanner;

public class FibbDemo{
	public static void main (String[] args) throws Exception{
	    	Scanner scan = new Scanner(System.in);
		int i;
		int n = scan.nextInt();
		int[] numbers = new int[n];
		numbers[0]=0;
		numbers[1]=1;
		System.out.print(numbers[0]+" "+numbers[1]+" ");
		for(i=2;i<n;i++){
			numbers[i]=numbers[i-1]+numbers[i-2];
			System.out.print(numbers[i]+" ");
		}
	}

}
