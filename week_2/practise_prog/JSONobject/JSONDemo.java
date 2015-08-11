//To practise JSON
import java.io.*;
import java.util.*;
import org.json.simple.JSONObject;
class JSONDemo{
	public static void main(String[] args) throws Exception{
		//Encoding
		JSONObject j = new JSONObject();
		j.put("name","Archit");
		j.put("num",new int[]{1,2,3});
		j.put("balance",100 );
		System.out.println(j);
		System.out.println("Hi");
		
	
		/*
		//Decoding
		JSONParser parser=new JSONParser();
		String s = "[0,{\"1\":{\"2\":{\"3\":{\"4\":[5,{\"6\":7}]}}}}]";String | Number | Object | Array | TRUE | FALSE | NULL
		try{
			Object obj =parser.parse(s);
			JSONArray array =(JSONArray)obj;
			System.out.println("second element="+array.get(1));
		*/	
	}
}
		
		
