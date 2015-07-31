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
		givenList.add("Charge");
		givenList.add("Chargebee");
		givenList.add("Charging");
		givenList.add("Charged");
		givenList.add("Archit");
		givenList.add("Archit_1");
		givenList.add("Help");
		givenList.add("Held");
		givenList.add("Hello");
		givenList.add("Sing");
		givenList.add("play");
		givenList.add("code");
		givenList.add("coding");
	}
}
