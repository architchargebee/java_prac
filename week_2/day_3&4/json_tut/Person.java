package json_tut;

import org.json.*;
import java.io.*;
import java.util.*;
import java.text.*;

public class Person {
	private String name;
	private String joiningDate;
	private String id;
    
	public String getName() {
        	return name;
    	}

	public void setName(String name) {
        	this.name = name;
    	}

	public String getJoiningDate() {
        	return joiningDate;
    	}

	public void setJoiningDate(String joiningDate) {
        	this.joiningDate = joiningDate;
    	}

	public String getId() {
	        return id;
    	}

	public void setId(String id) {
	        this.id = id;
    	}

}
