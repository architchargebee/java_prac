package json_tut;

import json_tut.*;
import org.json.*;

import java.util.*;
import java.text.*;

public class Marks {
	private float mark;
	private String subject = new String();

	public Marks(float mark, String subject) {
        	this.mark = mark;
        	this.subject = subject;
    	}

	public float getMark() {
	        return mark;
    	}

	public void setMark(float mark) {
        	this.mark = mark;
    	}

	public String getSubject() {
        	return subject;
    	}

    	public void setSubject(String subject) {
        	this.subject = subject;
    	}
    
    	public void print(){
        	System.out.println("Mark : " + this.mark);
        	System.out.println("Subject : " + this.subject);
    	}

}


