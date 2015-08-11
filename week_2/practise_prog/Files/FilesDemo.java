import java.io.*;
import java.util.*;
import java.nio.file.*;

class FilesDemo{
	public static void main(String[] args){
		File src = new File("/home/cb-archit/work/java_prac/week_1/day_1");
		File dest = new File ("/home/cb-archit/work/java_prac/week_2/practise_prog/test");
		 try{

			Files.copy(src.toPath(),dest.toPath());
		 }catch(IOException e){//otherwise throws an error: unknown exception - needs to be caught
		 	System.out.println("Exception occoured in copying");
		 }
		File dir = new File("/home/cb-archit/test");
		try{

			Files.createDirectory(dir.toPath());
		 }catch(IOException e){//otherwise throws an error: unknown exception - needs to be caught
		 	System.out.println("Exception occoured in making directory");
		 }
		 
		 System.out.println(Files.isDirectory(dir.toPath()));
		 /*try{
		 
			DirectoryStream<Path>stream=Files.newDirectoryStream(dir.toPath());
			for(Path entry:stream){
				if(Files.isDirectory(entry)){
					listFiles(entry);
				}
				files.add(entry);
			}
		}catch(IOException e){
			e.printStackTrace();
		}*/
		
		
				
			
		
		
	}
	
	
}
		
