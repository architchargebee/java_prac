/*Program to rotate any square matrix right or left according to the user input
Input array
1 2 3 
4 5 6 
7 8 9 
Enter the rotation r/l
r
Output array
7 4 1 
8 5 2 
9 6 3 

*/
import java.util.*;
import java.io.*;
public class ArrayRev{
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		int row,i,j;
	
		System.out.println("Enter the no of rows ");
		row= scan.nextInt();
	
		int[][] arr=new int[row][row];
		int[][] outputArr= new int[row][row];

		System.out.println("Enter "+(row*row)+" elements separated by a commma");
  		input(arr,row);
		
		System.out.println("Input array");
		printMatrix(arr, row);
		
		System.out.println("Enter the rotation r/l");
		String rotation=scan.next();
		if (rotation.charAt(0)  == 'l'){
			outputArr = rotateLeft(arr, row);	
		} else {
			outputArr= rotateRight(arr, row);
		}

		System.out.println("Output array");
		printMatrix(outputArr, row);
	}
	//for input and its validation	
	public static int[][] input(int[][] arr, int row) {
		Scanner scan = new Scanner(System.in);
		String s   = scan.nextLine(); 
		String[] result = s.split(",");
		if(result.length != (row *row) ) {
			System.out.println("Invalid entry");
			System.exit(0);
		}
		for (int i=0; i<row*row; i++)
			arr[i/row][i%row]=Math.round(Float.valueOf(result[i]));
		return arr;
	}
	//algorithm for rotating it right
	public static int[][] rotateLeft(int[][] arr, int row){
		int j,i;
		int[][] temp= new int[row][row];

		for(i= 0; i< row ; i++){
			for(j=0; j< row ; j++){
				temp[i][j]=arr[j][row-i-1];
			}
		}
		return temp;
	}
	//algorithm for rotating it left
	public static int[][] rotateRight(int[][] arr, int row){
		int j,i;
		int[][] temp= new int[row][row];

		for(i= 0; i< row ; i++){
			for(j=0; j< row ; j++){
				temp[i][j]=arr[row-j-1][i];
			}
		}
		return temp;
	}
	//two dimensional print matrix
	public static void printMatrix(int[][] arr, int row){
		int i,j;
		for(i=0; i<arr.length; i++){
			for(j=0;j< arr.length ; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
		
}
