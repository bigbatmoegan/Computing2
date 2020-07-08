// Honor Pledge:
//
// I pledge that I have neither given nor 
// received any help on this assignment.
//
// jeremorg

public class StaffTechnician extends Employee
{
	private boolean degree;
	
	public StaffTechnician()
	{
		//Default Constructor
		degree=true;
		hourlyRate=20.0;
	}
	
	public StaffTechnician(String firstName, String lastName, int employeeID)
	{
		super(firstName, lastName, employeeID);
		degree=true;
		hourlyRate=20.0;
	}
	
	public boolean getDegree()
	{
		return degree;
	}
}