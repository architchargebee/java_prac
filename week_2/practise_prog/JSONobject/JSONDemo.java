//To practise JSON
import java.io.*;
import java.util.*;
import org.json.*;
class JSONDemo{
	public static void main(String[] args) throws Exception{
		//Encoding
		JSONObject j = new JSONObject();
		j.put("name","Archit");
		int[] a={1,2,3};
		j.put("num",a);
		j.put("balance",100 );
		System.out.println(j);
		System.out.println("Hi");
		//System.out.println(int[]{1,2,3});
		
		JSONArray b = new JSONArray();
		b.put(j);
		
		JSONObject j1 = new JSONObject();
		j1.put("Employee",b);
		System.out.println(j1);
		
		String s= "{\"Alpha\":2,2:[1,2,3]}";
		
		JSONObject obj = new JSONObject(s);
		System.out.println(obj);
		String str="["+s+"," + s+"]";
		System.out.println(str);
		JSONArray arr = new JSONArray(str);
		System.out.println(arr);
	
		
	
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
		
		
