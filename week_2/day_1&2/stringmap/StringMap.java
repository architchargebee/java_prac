package stringmap;

import java.util.*;
import java.io.*;

public class StringMap{
	private HashMap <String, List <String>> map= new HashMap <String, List <String>>();;

	private void insertWord(String word){
		String len= String.valueOf(word.length());
		if(!(map.containsKey( len ))) {
			map.put(len, new ArrayList <String> ());
		}
		map.get(len).add(word);
	}

	public void getValue(){
		Console cons=System.console();
		int n=Integer.parseInt(cons.readLine("Enter the number of words: "));
		for(int i=0;i<n;i++){
			String word= new String(cons.readLine("Word"+(i+1)+": "));
			insertWord(word);
		}
	}
	
	public void putValue(){
		List <String> words;
		System.out.println("\n Mapping words");
		for(Map.Entry m:map.entrySet()){  
                        System.out.println(m.getKey()+" "+m.getValue());
		}
	}

	public static void main(String[] args){
		StringMap obj= new StringMap();
		obj.getValue();
		obj.putValue();
	}
}
