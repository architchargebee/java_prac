/*
* program to scan a directory and its sub directories and print all the file extensions along with the number of files with that extension
* FileToMAp class extends SimpleFileVisitor class to traverse through the directory tree.
* getFileWithoutExtension - takes in the file path and returns the file name without extension.
* getExtension - takes in the file path and returns the extension of the file in that path.
* insert - Maps the extensions as key and file names as values
* insertInMap - calls the funtions 
*/ 

package scanDir;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.nio.file.attribute.*;
import static java.nio.file.FileVisitResult.*;
import static java.nio.file.FileVisitOption.*;

public class FileToMap extends SimpleFileVisitor<Path> {

        private Map <String, ArrayList <String> > allFiles= new HashMap <String, ArrayList <String>> ();

	
	//Given the path, returns the file name without the extension
        private String getFileWithoutExtension(Path file){
        	String name= file.getFileName().toString();
        	int index = name.lastIndexOf('.');
        	return name.substring(0,index);
        }

        
        //Given the path, returns the extension of the file in that path
        private String getExtension(Path file){
        	String name= file.getFileName().toString();
        	int index = name.lastIndexOf('.');
        	return name.substring(index);
        }

        //Inserts the given key value pair into the Map
        private void insert(String extension, String fileName){
		if(!(allFiles.containsKey( extension ))) {
			allFiles.put(extension, new ArrayList <String> ());
		}
		allFiles.get(extension).add(fileName);
	}

	//Takes the path as input and finally inserts the extension as the key and the filename as value.
        private void insertInMap(Path file) {
            String fileName= getFileWithoutExtension(file);
            String extension= getExtension(file);
            insert(extension,fileName);
        }

        //Displays the extensions with the number of files in each extension.
        public void display(){
        	for(String extension: allFiles.keySet()){
        		System.out.println(extension + ": "+ allFiles.get(extension).size());
        	}
        }

        /* Invoke the pattern matching
         * method on each file.
	 * Simple File visitor methods
	 */
        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        	if(!(Files.isDirectory(file))) {
        		insertInMap(file);
        	}
            	return CONTINUE;
        }

        @Override
        public FileVisitResult visitFileFailed(Path file, IOException exc) {
            System.err.println(exc);
            return CONTINUE;
        }
	public static void main(String[] args) throws IOException {
        	Path startingDir = Paths.get("/home/cb-archit/sh/");
        	FileToMap fileToMap = new FileToMap();
        	Files.walkFileTree(startingDir, fileToMap);
        	fileToMap.display();
    	}
}
