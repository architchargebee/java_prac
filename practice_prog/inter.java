import java.util.*;
import java.io.*;
public class inter {
	public static void main(String[] args) {
		shape circleshape=new circle();
		circleshape.Draw();
		//circle circle1=new circle();
		circleshape.print();
		circleshape.test();
	}
}
 
interface shape{
	public   String baseclass="shape";
	public void Draw();  
	default void print(){
		System.out.println("Entering");
		
	}
   
      
}
class circle implements shape {
	public void Draw() {
		System.out.println("Drawing Circle here");
	}
	public static void test() {
		const int a=5;
		a++;
		System.out.println(a);
	}
}

