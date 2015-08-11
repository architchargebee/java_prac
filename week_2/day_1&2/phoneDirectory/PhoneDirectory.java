package phoneDirectory;

import java.util.*;
import java.io.*;

public class PhoneDirectory{
	private ArrayList <Entry> directory;
	public PhoneDirectory(ArrayList <Entry> directory){
		this.directory=directory;
	}

	//method for searching by phonr number - also searches for the substring in the name
	private void searchByName(String name){
		String temp;
		String nameLowerCase= name.toLowerCase();
		ArrayList <Entry> outputArrayList= new ArrayList <Entry> ();
		for(Entry person: directory){
			temp= person.getName().toLowerCase();
			if(temp.contains(nameLowerCase)){
				outputArrayList.add(person);
			}
		}
		display(outputArrayList);
	}
	
	//display method - prints the content of searched content
	private void display(ArrayList <Entry> outputArrayList){
		for(Entry person: outputArrayList){
			person.display();
		}
	}

	//method for search by phone number
	private void searchByPhoneNumber(int number){
		ArrayList <Entry> outputArrayList= new ArrayList <Entry> ();
		for(Entry person:directory){
			if(person.getMobile()==number || person.getWork()==number || person.getHome()==number){
				outputArrayList.add(person);
			}
		}
		display(outputArrayList);	
	}

	//Menu driven search option - default is name - multiple search option
	public void userOptions(){
		int n;
		char c;
		Console cons= System.console();
		do{
			n=Integer.parseInt(cons.readLine("Search by...\n1.Name\n2.Phone Number\n"));
			switch(n){
				case 1:
					searchByName(cons.readLine("Enter the String: "));
					break;
				case 2:
					searchByPhoneNumber(Integer.parseInt(cons.readLine("Enter the Phone Number: ")));
					break;
				default:
					System.out.println("Wrong option... Taking default option as \"Name\"");
					break;
			}
			c=cons.readLine("Do you want to continue???(y/n) ").charAt(0);
		}while(c=='y');
	}
}
