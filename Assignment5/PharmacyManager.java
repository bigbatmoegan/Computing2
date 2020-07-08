// Honor Pledge:
//
// I pledge that I have neither given nor 
// received any help on this assignment.
//
// jeremorg

public class PharmacyManager extends StaffPharmacist
{
	private boolean leadership;
	
	public PharmacyManager()
	{
		//Default Constructor
		leadership=true;
		hourlyRate=50.0;
	}
	
	public PharmacyManager(String firstName, String lastName, int employeeID)
	{
		super(firstName, lastName, employeeID);
		leadership=true;
		hourlyRate=50.0;
	}
	
	public boolean getLeadership()
	{
		return leadership;
	}
}