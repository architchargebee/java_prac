package mapwords;

import java.util.*;

public class MapWords{
	private TreeMap <String, TreeSet <String>> map= new TreeMap <String, TreeSet <String>> ();
	private ArrayList <String> givenList;

	public MapWords(ArrayList <String> givenList){
		this.givenList=givenList;
	}

	public void mapWords(){
		for(String value: givenList){
			insertWord(value);
		}
	}

	private void insertWord(String word){
		String key= word.substring(0,3);
		if( !(map.containsKey(key) ) ) {
			map.put(key, new TreeSet <String> () );
		}
		map.get(key).add(word);
	}

	public void display(){
                System.out.println("Mapping Words");
                for(Map.Entry m:map.entrySet()){  
                        System.out.println(m.getKey()+" "+m.getValue());  
                }
                
	}

}
