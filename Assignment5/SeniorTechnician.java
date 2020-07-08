// Honor Pledge:
//
// I pledge that I have neither given nor 
// received any help on this assignment.
//
// jeremorg

public class SeniorTechnician extends StaffTechnician
{
	private boolean serviceAward;
	
	public SeniorTechnician()
	{
		//Default Constructor
		serviceAward=true;
		hourlyRate=25.0;
	}
	
	public SeniorTechnician(String firstName, String lastName, int employeeID)
	{
		super(firstName, lastName, employeeID);
		hourlyRate=25.0;
		serviceAward=true;
	}
	
	public boolean getServiceAward()
	{
		return serviceAward;
	}
}