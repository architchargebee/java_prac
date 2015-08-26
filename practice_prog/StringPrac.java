import java.io.*;
import java.util.*;

class StringPrac{
	public static void main(String[] args){
		String str = "Hello";
		str += 100;
		System.out.println(str);
		
		char[] data = {'a','b','c','d'};
		String str1= new String(data);
		System.out.println(str1);
		
		//trying the constructors of string
		String[] str2 = {"hello","hi","hey"};
		for(String s:str2)
		System.out.println(s);
		new StringPrac().printS("hi");
		new StringPrac().printS("hi","World",2);
		String s3 = "my";
		s3=s3.concat("your");
		System.out.println(s3);
		String str4 ="   _Have a good day";
		str4=str4.trim();
		System.out.println("after trimming"+ str4);
		
		//Practising StringBuilder
		
		StringBuilder sb1 = new StringBuilder(str4);
		System.out.println(str4);
		sb1.append("_day1");
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb1);
		sb1.trimToSize();
		System.out.println(sb1);
		sb1.insert(5,121);
		System.out.println(sb1);
		
	
		
	}
		
	public void printS(String... y,int x){ // for this you have to pass the string array as a comma separated - variables not allowed and only string is allowed  
		System.out.println("in the printS method");
		for(String s:y)
			System.out.println(s);
	}
	
		
}

