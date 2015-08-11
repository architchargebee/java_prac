import java.util.*;
import java.io.*;
public class sortll implements Comparator<String>{
	public static void main(String args[]) {
		LinkedList <String> linkedlist = new LinkedList<String>();
		linkedlist.add("abc");
         	linkedlist.add("def");
         	linkedlist.add("123");
         	linkedlist.add("345");
         	linkedlist.add("789");
         	linkedlist.add("zxy");
		linkedlist.add("567");
		linkedlist.add("123456");
		linkedlist.add("cdscdgf");
		linkedlist.add("sd567");
		
		Collections.sort(linkedlist,new sortll());
		System.out.println(linkedlist);
		
	}
	public int categoryValue(String str){
		if(str.charAt(0)>=48 && str.charAt(0)<= 52){
			return 1;
		} else if(str.charAt(0)>=53 && str.charAt(0)<=59){
			return 3;
		}else {
			return 2;
		}
	}
	@Override
	public int compare(String str1, String str2){
		
		if(categoryValue(str1)<categoryValue(str2)){
			return -1;
		}else if(categoryValue(str1)>categoryValue(str2)){
			return 1;
		}else {
			
			return(str1.compareToIgnoreCase(str2));
		}
	}
}
