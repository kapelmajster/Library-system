/**
 * A class that represent a member.
 * 
 * 
 * @author Konrad Glowacki
 * @version 29/03/2022
 * 
 */
public class Member  {
	
	// The first name of the member.
	private String firstName;
	// The last name of the member.
	private String lastName;
	// The phone number of the member.
	private String phoneNumber;
	// The ID of the member.
	private int idMember;



	
	/**
	 * Constructor for objects of class Member
	 */
	public Member()
	{
		firstName = "";
		lastName = "";
		phoneNumber = "";
		idMember = 1;
	}
	
	/**
	 * Constructor to initialise member objects.
	 * @param firstName First name of the member
	 * @param lastName Last name of the member
	 * @param phoneNumber Member phone number
	 * @param id Member's ID
	 */
	public Member(String firstName, String lastName, String phoneNumber, int id)
	{
		// Validation for id and phone number parameter
		
		if (id < 0)
		{
			System.out.println("The ID number must be positive.");
		}
		else if(!phoneNumber.matches("[0-9]{11}"))
    	{
    		System.out.println("The phone number is not valid. It must contain 11 digits and only numbers");
    	}
		else 
		{
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
    	this.idMember = id;
		}
	}
	
    /**
     * Return member's first name
     * @return The member's first name.
     */
    public String getFirstName()
    {
        return firstName;
    }
    
	 /**
	  * Mutator method to change first name of the member.
	  * @param newFirstName Member new first name
	  */
    public void setFirstName(String newFirstName)
    {
    	firstName = newFirstName;
    }
    
    /**
     * Return member's last name
     * @return The member's last name.
     */
    public String getLastName()
    {
        return lastName;
    }
    
	 /**
	  * Mutator method to change last name of the member.
	  * @param newLastName Member new last name
	  */
    public void setLastName(String newLastName)
    {
    	lastName = newLastName;
    }
    
    /**
     * Return member's phone number
     * @return The member's phone number.
     */
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    
	 /**
	  * Mutator method to change phone number of the member.
	  * @param newPhoneNumber Member new phone number
	  */
    public void setPhoneNumber(String newPhoneNumber)
    {
    	phoneNumber = newPhoneNumber;
    }
	
    /**
     * Return member's ID
     * @return The member's ID.
     */
    public int getIdMember()
    {
        return idMember;
    }
    
	 /**
	  * Mutator method to change id of the member.
	  * @param newId Member new ID
	  */
   public void setIdMember(int newId)
    {
    	idMember = newId;
    }

    /**
     * A string representation of the member.
     */

	public String toString() 
	{
		return "First Name: " + firstName + ", Last Name: " + lastName + ", phone number: " + phoneNumber + ", Member ID: "
				+ idMember;
	}

    
    
}
