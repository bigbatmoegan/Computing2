// Honor Pledge:
//
// I pledge that I have neither given nor 
// received any help on this assignment.
//
// jeremorg

public class StaffPharmacist extends Employee
{
	private boolean license;
	
	public StaffPharmacist()
	{
		//Default constructor
		license=true;
		hourlyRate=40.0;
	}
	
	public StaffPharmacist(String firstName, String lastName, int employeeID)
	{
		super(firstName, lastName, employeeID);
		hourlyRate=40.0;
		license=true;
	}
	
	public boolean getLicense()
	{
		return license;
	}
}