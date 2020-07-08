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
		boolean mayEnter=false;
		keepGoing=true;
		int inthoursWorked=0;
		String choice="";
		String choice2="";
		//USed to store values from file and to pass into objects.
		//string version used to convert from read in file as string
		//to integer. Also used to return values from each employee to be printed. 
		int job=0;
		String fullName="";
		String jobString="";
		String firstName="";
		String lastName="";
		int employeeID=0;
		String employeeIDString="";
		double hourlyRate=0.0;
		boolean license=true;
		boolean degree=true;
		boolean leadership=true;
		boolean serviceAward=true;
		//Arrays used to store employees
		PharmacyManager[] pmArray=new PharmacyManager[1];
		StaffPharmacist[] spArray=new StaffPharmacist[1];
		StaffTechnician[] stArray=new StaffTechnician[1];
		SeniorTechnician[] STArray=new SeniorTechnician[1];
		while(keepGoing){
			System.out.println("1. Load Employees (From File)");
			System.out.println("2. Exit Program");
			System.out.print("Enter your Selection: ");
			Scanner input=new Scanner(System.in);
			choice=input.next();
			if(choice.equals("1")){
				try
				{
					InputStream inputStream=new FileInputStream("employees.txt");
					InputStreamReader reader=new InputStreamReader(inputStream);
					BufferedReader buffer=new BufferedReader(reader);
					//Call it to read the first 2 lines, since the first line
					//is not an employee, it can simply be ignored and immediately 
					//read the next line and start from there. 
					String line=buffer.readLine();
					line=buffer.readLine();
					while(line!=null){
						String[] result=line.split(",");
						//the next 4 lines are used to convert the string from
						//the file into an integer that can be passed into the 
						//objects as ints. 
						jobString=result[0];
						job=Integer.parseInt(jobString);
						employeeIDString=result[1];
						employeeID=Integer.parseInt(employeeIDString);
						firstName=result[2];
						lastName=result[3];
						if(job==1){
							PharmacyManager pharmacyManager=new PharmacyManager(firstName, lastName, employeeID);
							pmArray[0]=pharmacyManager;
						}
						else if (job==2){
							StaffPharmacist staffPharmacist=new StaffPharmacist(firstName, lastName, employeeID);
							spArray[0]=staffPharmacist;
						}
						else if (job==3){
							StaffTechnician staffTechnician=new StaffTechnician(firstName, lastName, employeeID);
							stArray[0]=staffTechnician;
						}
						else if(job==4){
							SeniorTechnician seniorTechnician=new SeniorTechnician(firstName, lastName, employeeID);
							STArray[0]=seniorTechnician;
						}
						line=buffer.readLine();
					}
					buffer.close();
					System.out.println("");
					System.out.println("File Successfully Loaded");
					System.out.println("");
					boolean keepGoing2=true;
					while(keepGoing2){
						System.out.println("1. Print Employee Information");
						System.out.println("2. Enter Hours Worked");
						System.out.println("3. Calculate Paycheks");
						System.out.println("4. Exit program");
						System.out.print("Enter Your Selection: ");
						choice2=input.next();
						if(choice2.equals("1")){
							System.out.println("");
							PharmacyManager pharmacyManager=pmArray[0];
							fullName=pharmacyManager.getName();
							employeeID=pharmacyManager.getID();
							hourlyRate=pharmacyManager.getHourlyRate();
							license=pharmacyManager.getLicense();
							leadership=pharmacyManager.getLeadership();
							System.out.format("ID: %-10s Name: %-15s Rate: %-5s Licensed: %-10s Has Leadership: %-10s\n",employeeID, fullName, hourlyRate, license, leadership);
							StaffPharmacist staffPharmacist=spArray[0];
							fullName=staffPharmacist.getName();
							employeeID=staffPharmacist.getID();
							hourlyRate=staffPharmacist.getHourlyRate();
							license=staffPharmacist.getLicense();
							System.out.format("ID: %-10s Name: %-15s Rate: %-5s Licensed: %-10s\n",employeeID, fullName, hourlyRate, license);
							SeniorTechnician seniorTechnician=STArray[0];
							fullName=seniorTechnician.getName();
							employeeID=seniorTechnician.getID();
							hourlyRate=seniorTechnician.getHourlyRate();
							degree=seniorTechnician.getDegree();
							serviceAward=seniorTechnician.getServiceAward();
							System.out.format("ID: %-10s Name: %-15s Rate: %-5s Has Degree: %-8s Has Service Award: %-10s\n",employeeID, fullName, hourlyRate, degree, serviceAward);
							StaffTechnician staffTechnician=stArray[0];
							fullName=staffTechnician.getName();
							employeeID=staffTechnician.getID();
							hourlyRate=staffTechnician.getHourlyRate();
							degree=staffTechnician.getDegree();
							System.out.format("ID: %-10s Name: %-15s Rate: %-5s Has Degree: %-8s\n",employeeID, fullName, hourlyRate, degree);
							System.out.println("");
							keepGoing2=true;
						}
						else if(choice2.equals("2")){
							String hoursWorked;
							System.out.println("");
							System.out.print("Please enter the hours worked: ");
							hoursWorked=input.next();
							System.out.println("");
							inthoursWorked=Integer.parseInt(hoursWorked);
							mayEnter=true;
							keepGoing2=true;
							
						}
						else if(choice2.equals("3")){
							//A boolean mayEnter is used to prevent from making a paycheck
							//without entering the amount of hours worked. Once the user enters
							//the number of hours worked, the boolean is set to true and then they
							//may calculate the paychecks.
							if(mayEnter==true){
								int checkAmount;
								System.out.println("");
								PharmacyManager pharmacyManager=pmArray[0];
								hourlyRate=pharmacyManager.getHourlyRate();
								employeeID=pharmacyManager.getID();
								int inthourlyRate=(int)hourlyRate;
								checkAmount=inthourlyRate*inthoursWorked;
								System.out.format("ID: %-10s Check Amount: $%-10s\n", employeeID, checkAmount);
								StaffPharmacist staffPharmacist=spArray[0];
								hourlyRate=staffPharmacist.getHourlyRate();
								employeeID=staffPharmacist.getID();
								inthourlyRate=(int)hourlyRate;
								checkAmount=inthourlyRate*inthoursWorked;
								System.out.format("ID: %-10s Check Amount: $%-10s\n", employeeID, checkAmount);
								SeniorTechnician seniorTechnician=STArray[0];
								hourlyRate=seniorTechnician.getHourlyRate();
								employeeID=seniorTechnician.getID();
								inthourlyRate=(int)hourlyRate;
								checkAmount=inthourlyRate*inthoursWorked;
								System.out.format("ID: %-10s Check Amount: $%-10s\n", employeeID, checkAmount);
								StaffTechnician staffTechnician=stArray[0];
								hourlyRate=staffTechnician.getHourlyRate();
								employeeID=staffTechnician.getID();
								inthourlyRate=(int)hourlyRate;
								checkAmount=inthourlyRate*inthoursWorked;
								System.out.format("ID: %-10s Check Amount: $%-10s\n", employeeID, checkAmount);
								System.out.println("");
								
							}
							else{
								System.out.println("");
								System.out.println("Please enter the hours worked (Option #2) before trying to calculate the paycheck amounts!");
								System.out.println("");
								keepGoing2=true;
							}
						}
						else if(choice2.equals("4")){
							System.out.println("");
							System.out.println("Goodbye!");
							keepGoing2=false;
							keepGoing=false;
						}
						else{
							System.out.println("Please enter 1-4 only.");
							keepGoing2=true;
						}
					}
				}
				catch(IOException ex)
				{
					System.out.println("File Load Failed");
					System.out.println(ex);
					System.out.println("Program Exiting...");
					keepGoing=false;
				}
			}
			else if(choice.equals("2")){
				keepGoing=false;
			}
			else{
				System.out.println("Please enter 1 or 2 only");
				keepGoing=true;
			}
		}
	}
}