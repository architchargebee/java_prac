/*
Below exercise would help you understand how “static” works in Java. You will be writing below 4 classes:
Student
Subject
ResultGenerator
StudentDemo

Class Student:
Member variables:
studentId: int 
studentName: String 
gender: boolean 
subjects: Subject

Methods
get and set methods for all the instance variables.

Class Subject:
Member variables:
subject1: String 
marks1: float 
subject2: String 
marks2: float 
subject3: String 
marks3: float

Methods
set and get methods for the above member variables.

Class ResultGenerator:
Methods:
generateResult - static method
 - Takes the Student object as input parameter and prints the report card by calculating the  total and average marks.

Class StudentDemo:
Methods:
storeStudentData - instance method
- Take the Student object as input parameter and fill it with the necessary data using set methods.
main method
- Create an instance of the class Student. Pass the Student object to storeStudentData method to fill it with values. Call the generateResult method to print the report card.
*/
package package_day3;

import java.io.Console;

class Student{
	private int studentId;
	String studentName;
	private boolean gender;
	Subject subjects;

	public void set(int id, String name, boolean gen, Subject subj){
		studentId=id;
		studentName= name;
		gender=gen;
		subjects= subj;
	}
	public Student get(){
		return this;
	}
}

class Subject{
	float marks1, marks2, marks3;
	String subject1, subject2, subject3;
	
	public void set(String sub1, String sub2, String sub3, float mark1, float mark2, float mark3){
		subject1= sub1;
		marks1= mark1;
		subject2= sub2;
		marks2= mark2;
		subject3= sub3;
		marks3= mark3;
	}

	public Subject get(){
		return this;
	}

}


class ResultGenerator{
		static void generateResult(Student stu){
		float total, average;
		total= stu.subjects.marks1 + stu.subjects.marks2 + stu.subjects.marks3;
		average= total/3;
		System.out.println("Name: "+stu.studentName);
		System.out.println("Subject:\tMarks: ");
		System.out.println(stu.subjects.subject1+"\t\t"+stu.subjects.marks1);
		System.out.println(stu.subjects.subject2+"\t\t"+stu.subjects.marks2);
		System.out.println(stu.subjects.subject3+"\t\t"+stu.subjects.marks3);
		System.out.println("Total: "+total+"\tAverage: "+ average);
	}
}

public class StudentDemo{
//Create an instance of the class Student. Pass the Student object to storeStudentData method to fill it with values. Call the generateResult method to print the report card.

	public static void main(String[] args) throws Exception{
		StudentDemo stuDemo= new StudentDemo();
		Student stu= new Student();
		stu= stuDemo.storeStudentData(stu); 		
		//ResultGenerator printResult= new ResultGenerator();
		/*printResult.*/ResultGenerator.generateResult(stu);


	}

	public Student storeStudentData(Student stu){
		Subject sub= new Subject();
		sub.set("mat", "phy", "chem", 88,77,66);
		stu.set(1234, "qwerty", true, sub.get());
		return stu.get();
	}
}
