//Program to pracrise file
import java.io.*;
import java.util.*;

class FileDemo{
	public static void main(String[] args){
		File f1 = new File("/home/cb-archit/work/java_prac/week_2/practise_prog/Files/file1.txt");
		//to check if the new file is created successfully
		try{
			boolean fvar =f1.createNewFile();//creates a new file
			if(fvar){
				System.out.println("New file successfully created");
			} else {
				System.out.println("New file creation unsuccessful");
			}
		 }catch(IOException e){//otherwise throws an error: unknown exception - needs to be caught
		 	System.out.println("Exception occoured");
		 }
		 File f2=new File("/home/cb-archit/");
		 try{
		 	System.out.println("can Excecute="+f1.canExecute());
		 	System.out.println("can Read="+f1.canRead());
		 	System.out.println("can Write="+f1.canWrite());
		 	System.out.println("Compare to="+f1.compareTo(f2));
		 	System.out.println("equals="+f1.equals(f2));
		 	f2.createTempFile("temp","txt");
		 	System.out.println("exists="+f1.exists());
		 	System.out.println("exists="+f2.exists());
		 	System.out.println("delete="+f2.delete());
		 	System.out.println("Absolute file="+f1.getAbsoluteFile());
		 	System.out.println("Absolute path="+f1.getAbsolutePath());
		 	System.out.println("Canonical file="+f1.getCanonicalFile());
		 	System.out.println("canonical path="+f1.getCanonicalPath());
		 	System.out.println("get name="+f1.getName());
		 	System.out.println("get parent="+f1.getParent());
		 	System.out.println("parent file="+f1.getParentFile());
		 	System.out.println("path="+f1.getPath());
		 	System.out.println("Directory="+f1.isDirectory());
		 	System.out.println("File="+f1.isFile());
		 	System.out.println("length="+f1.length());
		 	System.out.println("last modified="+f1.lastModified());
		 	System.out.println("absolute="+f1.isAbsolute());
		 }catch(IOException e){
		 	System.out.println("Exception occoured");
		 }
		 File f3=new File("/home/cb-archit/work/java_prac");
		 String str[]=f3.list();
		 System.out.println("Files inside the java_prac folder are:");
		 for(String s:str)
		 	System.out.println(s);
		 str[]=f3.listFiles();
		 System.out.println("Files inside the java_prac folder are:");
		 for(String s:str)
		 	System.out.println(s);
		 str[]=f3.list(FilenameFilter week);
		 System.out.println("Files inside the java_prac folder are:");
		 for(String s:str)
		 	System.out.println(s);
		 
		 

	
	}
}
