//Program to practise Hashmaps and Concureent Hashmaps
import java.util.*;
import java.io.*;

class HashMapSynchronization{
	public static void main(String[] args){
		Map <String,String> map =new HashMap<>();
		map.put("one","ONE");
		map.put("two","TWO");
		map.put("three","Three");
		for(Map.Entry m:map.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		//for converting normal hashmap to synchronized hashmap
		Map<String,String> syncmap=Collections.synchronizedMap(map);
		System.out.println("Synchronized map="+syncmap);
		map.remove("one");
		String var=map.get("two");
		Set set2 = map.entrySet();
		System.out.println(set2);
		System.out.println(map.containsKey("two"));
		System.out.println(map.containsValue("THREE"));
		for(Map.Entry m:map.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		Set set1 = map.keySet();
		System.out.println(set1);
	}
}

		

