import java.util.*;
import java.io.*;
public class sortll {
	public static void main(String args[]) {
		LinkedList <String> linkedlist = new LinkedList<String>();
		linkedlist.add("abc");
         	linkedlist.add("def");
         	linkedlist.add("123");
         	linkedlist.add("345");
         	linkedlist.add("789");
		linkedlist.add("567");
		linkedlist.add("123456");
		linkedlist.add("cdscdgf");
		linkedlist.add("sd567");
		sortList(linkedlist);
	}	
	public static void sortList(LinkedList <String> linkedlist){
		//Splitting the main linked list into three linked list - one for each property sort.
		LinkedList<Integer> linked1 = new LinkedList<Integer>();
		LinkedList<String> linked2 = new LinkedList<String>();
		LinkedList<Integer> linked3 = new LinkedList<Integer>();
		int temp;
		int i,j=0,k=0,l=0;
		//Identifying the elements to group in a separate linked list
		for(i=0; i< linkedlist.size(); i++){
      			temp=(int)((linkedlist.get(i)).toLowerCase()).charAt(0);
			//for determining if the first digit is 0-4
			if(temp>=48 && temp <= 52){
				linked1.add(j,Integer.valueOf(linkedlist.get(i)));
				j++;
			} else {
				//for determining if the first digit is 5-9
				if(temp>=53 && temp <= 57){
					linked3.add(l,Integer.valueOf(linkedlist.get(i)));
					l++;
				//rest is string
				} else {
					linked2.add(k,linkedlist.get(i));
					k++;
				}
			}		
		}
		//Sorting Indiviual lists separately
		Collections.sort(linked1);
		Collections.sort(linked2);
		Collections.sort(linked3);
		int m=0;//pointer for main linked list

		for(i=0;i<linked1.size(); i++){
			linkedlist.set(m,String.valueOf(linked1.get(i)));
			m++;
		}
		for(i=0; i< linked2.size(); i++){
			
			linkedlist.set(m,linked2.get(i));
			m++;
		}
		for(i=0; i< linked3.size(); i++){
			
			linkedlist.set(m,String.valueOf(linked3.get(i)));
			m++;
		}
		System.out.println(linkedlist);
	}
}
