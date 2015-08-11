//To practise Readers and Writers
import java.io.*;
import java.util.*;
class ReadersDemo{
	public static void main(String[] args){
		Reader reader = new FileReader("/home/cb-archit/work/java_prac/week_2/practise_prog/Files/file2.txt");
		int data = reader.read();
		While(data != -1){
			char datachar = (char)data
			data =reader.read();
		}
	
		Writer writer = newf
