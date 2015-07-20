/*
Implement an animal class. You should be able to create an instance and populate its variables using user input. The code should not end once it configures an animal object. It should ask for the next input. Also it should keep printing the number of animals created.
*/
package package_day3;

import java.io.Console;

public class Animal{
	
	public static void main(String[] args) throws Exception{
		Console cons= System.console();
		int count =0;
		char flag='y';
		AnimalProp[] arrayobj = new AnimalProp[10];
		while(flag == 'y'){
			System.out.println("Enter the student details: ");
			arrayobj[count]=new AnimalProp();
			count++;
			flag=cons.readLine("Do u want to continue??? (y/n)").charAt(0);
		}
		System.out.println("Printing all student data:");
		//for(AnimalProp obj:arrayobj)
		for(int i=0;i<count;i++)
			arrayobj[i].printDetails();
		

	}
}

// Class to define the properties
class AnimalProp{
	
	static int count=1;
	String name,standard,section;
	int index;

	AnimalProp(){
		Console cons= System.console();
		this.name=cons.readLine("Name- ");
		this.standard=cons.readLine("standard- "); 
		this.section=cons.readLine("Section- "); 
		index=count++;
	}
	
	public void printDetails(){
		System.out.println("serial number- "+index+" of "+count);
		System.out.println("Name: " +this.name+ "\nSpecies: "+this.standard+ "\nOrder: "+this.section);
	}
}
