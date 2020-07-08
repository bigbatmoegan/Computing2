// Honor Pledge:
//
// I pledge that I have neither given nor 
// received any help on this assignment.
//
// jeremorg
public class Address
{
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String zipCode;
	
	public Address()
	{
		//Default Constructor
		this.address1="";
		this.address2="";
		this.city="";
		this.state="";
		this.zipCode="";
	}
	
	public void setAddress(String address1, String address2, String city, String state, String zipCode)
	{
		this.address1=address1;
		this.address2=address2;
		this.city=city;
		this.state=state;
		this.zipCode=zipCode;
	}
	
	public String getAddress()
	{
		//check whether student has a address2 or not
		//returns as one long string
		if(address2.equals("")){
			return address1+" "+city+","+state+" "+zipCode;
		}
		else{
			return address1+" "+address2+" "+city+","+state+" "+zipCode;
		}
	}
}
