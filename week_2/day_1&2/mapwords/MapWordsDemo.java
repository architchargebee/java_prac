package mapwords;

import java.util.*;

public class MapWordsDemo{
	public static void main(String[] args){
		ArrayList <String> givenList= new ArrayList <String> ();
		addWords(givenList);
		MapWords obj=new MapWords(givenList);
		obj.mapWords();
		obj.display();
	}

	private static void addWords(ArrayList <String> givenList){
		givenList.add("charge");
		givenList.add("chargebee");
		givenList.add("charging");
		givenList.add("charged");
		givenList.add("archit");
		givenList.add("archit_1");
		givenList.add("help");
		givenList.add("held");
		givenList.add("hello");
		givenList.add("sing");
		givenList.add("play");
		givenList.add("code");
		givenList.add("coding");
	}
}
