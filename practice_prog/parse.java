import java.util.*;
import java.io.*;

class parse{
	public static void p1(String str){
		try{
			float f = Float.parseFloat(str);
		}catch(NumberFormatException nfe) {
			f=0;
		} finally {
			System.out.println(f);
		}
	}
	public static void main(String[] args){
		p1("invalid");
	}
}
