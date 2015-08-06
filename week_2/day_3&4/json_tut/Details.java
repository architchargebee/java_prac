package json_tut;

import org.json.*;
import java.io.*;
import java.util.*;
import java.text.*;
public class Details {

	public static void processor(JSONObject jobj) throws JSONException {
        	Iterator iterator = jobj.keys();

        while (iterator.hasNext()) {
        	String key = (String) iterator.next();
            	if (key.toLowerCase().equalsIgnoreCase("student")) {
                	Student s = new Student();
                	ArrayList<Marks> list = new ArrayList();
                	s.setName(jobj.getJSONObject(key).getString("Name"));
                	s.setId(jobj.getJSONObject(key).getString("ID"));
                	s.setJoiningDate(jobj.getJSONObject(key).getString("Date Of Joining"));
                	s.setStandard(jobj.getJSONObject(key).getString("Std"));
                	JSONArray tempo = jobj.getJSONObject(key).getJSONArray("Marks");

                	for (int i = 0; i < tempo.length(); i++) {
                	    JSONObject tempoObj = tempo.getJSONObject(i);
                	    list.add(new Marks(Float.parseFloat(tempoObj.getString("Mark")), tempoObj.getString("Subject")));
                	}
                	s.setMarks(list);
                	s.print();
                	System.out.println();
            } else if (key.toLowerCase().equalsIgnoreCase("teacher")) {
                Teacher t = new Teacher();
                ArrayList<String> list = new ArrayList();
                t.setName(jobj.getJSONObject(key).getString("Name"));
                t.setId(jobj.getJSONObject(key).getString("ID"));
                t.setJoiningDate(jobj.getJSONObject(key).getString("Date Of Joining"));
                t.setSalary(Float.parseFloat(jobj.getJSONObject(key).getString("Salary")));

                JSONArray tempo = jobj.getJSONObject(key).getJSONArray("Classes Taking Care Of");

                for (int i = 0; i < tempo.length(); i++) {
                    list.add(tempo.getString(i));
                }
                t.setClassesHandled(list);
                t.print();
                System.out.println();
            }
        }
}
public static JSONObject readJsonObjectData(String fileName) throws Exception { //processes the Json object and returns 
        File f = new File(fileName);
        FileInputStream fr = new FileInputStream(f);
        byte[] b = new byte[fr.available()];
        fr.read(b);
        JSONObject jobj = new JSONObject(new String(b));
        return jobj; // The required Json object

}

    public static void main(String[] args) throws Exception {
        String source = "/home/cb-archit/input.json";
        JSONObject jobj = readJsonObjectData(source);
        processor(jobj);
    }
}
