package json_tut;

import org.json.*;
import json_tut.*;
import java.util.*;
import java.text.*;
import java.io.*;

public class Student extends Person {
    
	private String standard;
	private ArrayList<Marks> marks = new ArrayList();
    
	public String getStandard() {
	        return standard;
	}

    	public void setStandard(String standard) {
        	this.standard = standard;
    	}

    	public ArrayList<Marks> getMarks() {
        	return marks;
    	}

    	public void setMarks(ArrayList<Marks> marks) {
        	this.marks = marks;
    	}
    
    	public void print() {
        	System.out.println("Name: " + super.getName());
        	System.out.println("Standard: " + this.standard);
        	System.out.println("ID: " + super.getId());
        	System.out.println("Joining Date: " + super.getJoiningDate());
        	for(int i=0; i<marks.size(); ++i)
           		marks.get(i).print();
        
    	}
}
