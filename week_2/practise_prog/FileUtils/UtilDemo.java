import java.io.*;
import java.util.*;
import org.apache.commons.io.*;

class UtilDemo{
	public static void main(String[] args)throws Exception{
		File f2 = new File("/home/cb-archit/work/java_prac/week_2/practise_prog/Files/file2.txt");
		FileUtils.writeStringToFile(f2,"hey");
		String str=FileUtils.readFileToString(f2);
		System.out.println(str);
		
	}
}
		
