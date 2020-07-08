// Honor Pledge:
//
// I pledge that I have neither given nor 
// received any help on this assignment.
//
// jeremorg

public class Student
{
	private String firstName;
	private String lastName;
	private String studentID;
	private String GPA;
	private Address address;
	
	
	public Student ()
	{
		//Default constructor
		address=new Address();
		this.firstName="";
		this.lastName="";
		this.studentID="";
		this.GPA="";
	}
	
	public void setStudent(String firstName, String lastName, String studentID, String GPA)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.studentID=studentID;
		this.GPA=GPA;
	}
	
	public void setAddress(String address1, String address2, String city, String state, String zipCode)
	{
		address.setAddress(address1, address2, city, state, zipCode);
	}
	
	public String getAddress()
	{
		return address.getAddress();
	}
	
	public String getName()
	{
		return firstName+" "+lastName;
	}
	
	public String getID()
	{
		return studentID;
	}
	
	public String getGPA()
	{
		return GPA;
	}
	
}