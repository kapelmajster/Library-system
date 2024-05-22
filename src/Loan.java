import java.text.SimpleDateFormat;
import java.util.Date;

/**
* A class that represent a loan of the book to the member.
* 
* 
* @author Konrad Glowacki
* @version 29/03/2022
* 
*/

public class Loan {
	
	private Book idBook;
	private Member idMember;
	private Date today;
	private Date overdue;
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");


	/**
	 * Constructor to initialise loans objects.
	 * @param idMember ID of the member
	 * @param idBook ID of the book
	 * @param today The date when the book was loaned
	 * @param overdue the date when the book should be return
	 */
	public Loan(Member idMember, Book idBook, Date today, Date overdue)
	{
		this.idBook = idBook;
		this.idMember = idMember;
		this.today = today;
		this.overdue = overdue;
	}

	/**
	 * Return book's ID
	 * @return The book's ID from the Book class
	 */
	public Book getIdBook() 
	{
		return idBook;
	}

	/**
	 * Mutator method to change id of the book
	 * @param idBook new book ID
	 */

	public void setIdBook(Book idBook) 
	{
		this.idBook = idBook;
	}

	/**
	 * Return member's ID
	 * @return The member's ID from the Member class
	 */

	public Member getIdMember() 
	{
		return idMember;
	}

	/**
	 * Mutator method to change the member ID
	 * @param idMember new member's ID	 
	 **/

	public void setIdMember(Member idMember) 
	{
		this.idMember = idMember;
	}
	
	/**
	 * Return date when the book was loaned
	 * @return the date when the book was loaned
	 */
	public Date getToday() 
	{
		return today;
	}

	/**
	 * Setter to set new date for the loaned book
	 * @param today new date when the book was loaned
	 */

	public void setToday(Date today) 
	{
		this.today = today;
	}
	
	/**
	 * Return the date when the book should be return
	 * @return the date when the book should be return
	 */
	public Date getOverdue() 
	{
		return overdue;
	}

	/**
	 * Setter to set new date to return the book
	 * @param overdue new date to return the book
	 */
	public void setOverdue(Date overdue) 
	{
		this.overdue = overdue;
	}

	/**
	 * A string representation of the loan
	 */
	public String toString() 
	{
		return "The book: " + idBook + " has been borrowed by member: " + idMember + " on: " + sdf.format(today) + ". The date to return the book is: " + sdf.format(overdue) ;
		
	}







	
}
