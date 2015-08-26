import java.util.*;
import java.io.*;

class money{
	private String country = "Canada";
	public String getC(){return country;}
}
class yen extends money{
	public String getC(){ return super.country;}
}
public class euro extends money{
	public String getC(int x){ return super.getC();}
	public static void main(String[] args){
		System.out.println(new yen().getC()+" "+ new euro().getC());
	}
}
