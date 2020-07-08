// Honor Pledge:
//
// I pledge that I have neither given nor 
// received any help on this assignment.
//
// jeremorg

public class Employee
{
	private int employeeID;
	private String firstName;
	private String lastName;
	public double hourlyRate;
	
	public Employee()
	{
		//Default constructor
		employeeID=0;
		hourlyRate=0.0;
		firstName="";
		lastName="";
	}
	
	public Employee(String firstName, String lastName, int employeeID)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.employeeID=employeeID;
		this.hourlyRate=0.0;
	}
	
	public String getName()
	{
		return firstName+" "+lastName;
	}
	
	public int getID()
	{
		return employeeID;
	}
	
	public double getHourlyRate()
	{
		return hourlyRate;
	}
}