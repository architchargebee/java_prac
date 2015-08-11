package json_tut;

import java.io.*;
import java.util.*;
import java.text.*;

import org.json.*;

public class JsonWrite{
	
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new FileReader("/home/cb-archit/work/java_prac/week_2/day_3&4/json_tut/students-teachers.json"));
		StringBuilder jsonString= new StringBuilder();
		String line;
		while( (line=br.readLine())!= null ){
			jsonString.append(line);
		}

		JSONObject jsonObj= new JSONObject(jsonString.toString());
		Student stuObj= new Student(jsonObj.getJSONObject("Student"));
		Teacher teachObj= new Teacher(jsonObj.getJSONObject("Teacher"));
		stuObj.setData();
		teachObj.setData();
		System.out.println();
		System.out.println(stuObj.toString());
		System.out.println(teachObj.toString());
	}
}
