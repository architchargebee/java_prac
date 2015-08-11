/* Program to ptactice array List
*/
import java.util.*;
import java.io.*;

class ArrayListEg{
	public static void main(String[] args){
		List <String> al = new ArrayList <String>();
		al.add("one");
		al.add("two");
		al.add(2,"three");
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		Iterator iter = al.iterator();
      		while (iter.hasNext()) {
         		System.out.println(iter.next());
      		}
		if (al.contains("three")){
			System.out.println(al);
		} else {
			al.add(2,"three");
			System.out.println(al);
		}
		al.set(1,"Three");
		System.out.println(al);
		System.out.println("Number of elements ="+ al.size());
		String str=al.get(1);
		System.out.println(str);
		int position=al.indexOf("two");
		System.out.println(position);
	}
}
		
		
