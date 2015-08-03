import java.util.*;
import java.io.*;
abstract class abclassparent{
	public void function1(){
		System.out.println("From the abstract class method");
	}
	public abstract void function2();
}
public class abclass extends abclassparent {
	@Override
	public void function2() {
		System.out.println("In the child/derived class");
	}
	public static void main(String[] args){
		abclass obj = new abclass();
		obj.function1();
		obj.function2();
		obj.test("a");
		obj.test("a");
	}
	public void test(String... strings){
		for( String s : strings ) {
          		System.out.println(s);
		}
	}
	public void test(String a){
		System.out.println(a);
	}
}

		

