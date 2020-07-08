// Honor Pledge:
//
// I pledge that I have neither given nor 
// received any help on this assignment.
//
// jeremorg

import java.util.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileInputStream;

public class Driver
{
	public static void main (String [] args)
	{
		boolean keepGoing;
		keepGoing=true;
		//used to store split line values and to be passed in as parameters
		String firstName;
		String lastName;
		String address1;
		String address2;
		String city;
		String state;
		String zipCode;
		String studentID;
		String GPA;
		//used to print out student information
		String studentName;
		String address;
		Stack<Student> studentStack=new Stack<Student>(10);
		while(keepGoing){
			System.out.println("1. Load Students (From File)");
			System.out.println("2. Print Stack");
			System.out.println("3. Exit Program");
			Scanner input=new Scanner(System.in);
			String choice;
			System.out.print("Enter Your Selection: ");
			choice=input.next();
			//convert user input into integer
			int answer=Integer.parseInt(choice);
			if(answer==1){
				System.out.println("");
				//File IO to catch missing students file
				try
				{
					InputStream inputStream=new FileInputStream("students.txt");
					InputStreamReader reader=new InputStreamReader(inputStream);
					BufferedReader buffer=new BufferedReader(reader);
					String line=buffer.readLine();
					while(line!=null)
					{
						String[] result=line.split(",");
						firstName=result[0];
						lastName=result[1];
						address1=result[2];
						address2=result[3];
						city=result[4];
						state=result[5];
						zipCode=result[6];
						studentID=result[7];
						GPA=result[8];
						Student student=new Student();
						student.setStudent(firstName, lastName, studentID, GPA);
						student.setAddress(address1, address2, city, state, zipCode);
						studentStack.push(student);
						line=buffer.readLine();
					}
					buffer.close();
					System.out.println("Students Loaded from file!");
					System.out.println("");
					keepGoing=true;
				}
				catch(IOException ex)
				{
					//print out exception
					System.out.println("File Load Failed!");
					System.out.println(ex);
					System.out.println("Closing Program.");
					keepGoing=false;
				}
			}	
			else if(answer==2){
				//to show if stack is empty 
				if(studentStack.isEmpty()){
					System.out.println("Stack is empty – cannot pop!");
				}
				while(!studentStack.isEmpty()){
					//student used to store popped student
					Student student=studentStack.pop();
					studentName=student.getName();
					studentID=student.getID();
					GPA=student.getGPA();
					address=student.getAddress();
					//used.format to get exen spacing
					System.out.format("ID: %-10s Name: %-20s Address: %-60s GPA: %-5s\n", studentID, studentName, address, GPA);
				}
				
			}
			else if(answer==3){
				System.out.println("");
				System.out.println("Goodbye!");
				keepGoing=false;
				
			}
			else{
				//loop so program doesnt crash
				System.out.println("Please enter 1 through 3 only.");
				keepGoing=true;
			}
		}
	}
}