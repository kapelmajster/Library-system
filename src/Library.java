import java.util.ArrayList;
import java.util.Iterator;
import java.util.Calendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * A class to maintain library resources: its members and books.
 * 
 * 
 * @author Konrad Glowacki
 * @version 29/03/2022
 * 
 */

public class Library {
	
	private ArrayList<Member> memberList;
	private ArrayList<Book> bookList;
	private ArrayList<Member> deletedMember;
	private ArrayList<Book> deletedBook;
	private int idBook;
	private int idMember;
	private ArrayList<Loan> onLoan;
	private ArrayList<Book> availableBook;
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");


	
	
	/**
	 * Constructor for object of Library class.
	 */
	public Library()
	{
		memberList = new ArrayList<Member>();
		bookList = new ArrayList<Book>();
		deletedMember = new ArrayList<Member>();
		deletedBook = new ArrayList<Book>();
		idBook = 1;
		idMember = 1;
		onLoan = new ArrayList<Loan>();
		availableBook = new ArrayList<Book>();




	}
	
    /**
     * Add a new member to the library. The ID of the member is generated automatically.
     * @param firstName First name of the member.
     * @param lastName Last name of the member.
     * @param phoneNumber Member's phone number
     */
    public void join(String firstName, String lastName, String phoneNumber)
    {   	
    			
    	// validation for the phone number
    	if (!phoneNumber.matches("[0-9]{11}"))
    	{
    		System.out.println("Cannot create user " + firstName + " " + lastName + " The phone number is not valid. It must contain 11 digits and only numbers.");
    	}
    	else
    	{
 
    	memberList.add(new Member(firstName, lastName, phoneNumber, idMember));
    	idMember++;
    	}
    }
	
 
    /**
     * Printing the details of member using his/her specific ID.
     * @param id Member ID used to find member's details.
     * @return either true when find a member or false when it does not find a member
    **/
  
    public boolean showMemberId (int id)
    {
      	 Iterator<Member> it = memberList.iterator();
       	 boolean found = false;
       	 while(it.hasNext())
       	 {
         Member element = it.next();
       	 if(id == element.getIdMember())
       	 {
       		found = true;	
       	 	System.out.println(element.toString());
       	 }
       	 }
       	if (found != true)
   	 	{
   	 	System.out.println("There is no member with ID: " + id);
   	 	}
       	return found;
  	}
    
    /**
     * It shows how many members the library has.
     * @return total number of library's members.
     */
    public int numberOfMembers()
    {
        return memberList.size(); 
    }
   	 
    /**
     * For each loop method use to print details of every members.
     */
    public void printAllMembers()
    {
    	System.out.println("The list of all library members:");
    	for(Member element : memberList)
    	{
        System.out.println(element.toString());
        }

    }
    
    
    
    /**
     * Add a new book to the library. The ID for the book is created automatically.
     * @param author Author of the book.
     * @param title Title of the book.
     * @param type Type of the book. Either fiction or non-fiction.
     */
    public void addBook(String author, String title, String type)
    {
    	bookList.add(new Book(author, title, type, idBook));
    	availableBook.add(new Book(author, title, type, idBook));
    	idBook++;

    }
    
    
    /**
     * Printing the details of a book using its specific ID.
     * @param id Book ID used to find book's details.
     * @return either true when find a book or false when it does not find a book
    **/
  
    public boolean showBook (int id)
    {
      	Iterator<Book> it = bookList.iterator();
        boolean found = false;
        while(it.hasNext())
        {
        	Book element = it.next();
        	if(id == element.getIdBook())
        	{
        		found = true;	
        		System.out.println(element.toString());
        	}
        }
        if (found != true)
   	 	{
   	 		System.out.println("There is no book with ID: " + id);
   	 	}
       	return found;
   	}
    
    /**
     * It shows how many books are in library
     * @return total number of books in library.
     */
    public int numberOfBooks()
    {
        return bookList.size(); 
    }
   	 
   	 
    /**
     * For each loop method use to print details of every books.
     */
    public void printAllBooks()
    {
    	System.out.println("The list of all books in library:");
    	for(Book element : bookList)
    	{
    		System.out.println(element.toString());
        }

    }
    
    /**
     * Method to return the value of looking member's ID 
     * @param id ID of a looking member
     * @return The looking member's ID.
     */
    public Member returnMemberId (int id)
    {
    	Member m = null;
     	int index = 0;
     	boolean found = false;
        while(index < memberList.size() && !found)
        {
        	m = memberList.get(index);
        	int q = m.getIdMember();
        	if(q == id)
        {
        		found = true;
        }
        	else 
        	{
        		index++;
        	}
        
        }
        return m;
    }
    /**
     * Method use to find the specific member using his/her surname
     * @param searchString Last name of a member
     */
    
    public void showMemberLastName (String searchString)
    {
    	int index = 0;
    	boolean found = false;
    	while (index < memberList.size())
    	{
    		 Member element = memberList.get(index);
    		 String a = element.getLastName();
    		    if(a.contains(searchString)) 
    		    {
    		    	found = true;
    		    	System.out.println(memberList.get(index));
    		    	index++;
    		    }
    		    else 
    		    {
    		    	index++;
    		    }
    		    
    	}	    
    		    
    		    if(found == false) 
    		    {
    		    	System.out.println("The looking last name " + searchString + " doesn't exist");
    		    	
    		    }
    		    else
    		    {
    		    	System.out.println("The result for last name: " + "'" + searchString + "'" + " is listed above");
    		    }
    }
    
    /**
     * Method use to remove members. Before the member will be complete removed from array list it is going to be moved to the different one
     * called deletedMember.
     * @param id ID of the member that will be deleted
     * @return Array List of deleted members
     */
    
    public ArrayList<Member> removedMembers (int id)

    {
   	 Iterator<Member> it = memberList.iterator();
   	 boolean found = false;
   	 while(it.hasNext())
   	 {
   		 Member element = it.next();
   		 if(id == element.getIdMember())
   		 {
   			 found = true;	 
   			 deletedMember.add(element);
   			 it.remove();
   		 }
   	 }
   	 	if (found == true)
   	 	{
   	 		System.out.println("The member with ID: " + id + " has been removed.");
   	 	}
   	 	else {
   	 		System.out.println("There is no member with ID: " + id);
   	 	}
     return deletedMember;
    }

    /**
     * Method use to print all removed members.
     */
    
    public void printRemovedMembers()
    {
    	
    	System.out.println("The number of deleted members " + deletedMember.size());
    	for(Member element : deletedMember)
        {
        System.out.println(element.toString());
        }
    }
    
    
    /**
     * Method to return the value of looking book's ID 
     * @param id ID of a looking book
     * @return The looking book's ID.
     */
    public Book returnBookId (int id)
    {
    	Book b = null;
     	int index = 0;
     	boolean found = false;
        while(index < availableBook.size() && !found)
        {
        	b = availableBook.get(index);
        	int q = b.getIdBook();
        	if(q == id)
        {
        		found = true;
        }
        	else 
        	{
        		index++;
        	}
        
        }
        return b;
    }
    /**
     * Method use to find the specific book using its title
     * @param searchString Title of a book
     */
    
    public void showBookTitle (String searchString)
    {
    	int index = 0;
    	boolean found = false;
    	while (index < bookList.size())
    	{
    		 Book element = bookList.get(index);
    		 String a = element.getTitle();
    		    if(a.contains(searchString)) 
    		    {
    		    	found = true;
    		    	System.out.println(bookList.get(index));
    		    	index++;
    		    }
    		    else 
    		    {
    		    	index++;
    		    }
    		    
    	}	    
    		    
    		    if(found == false) 
    		    {
    		    	System.out.println("The looking title " + searchString + " doesn't exist");
    		    	
    		    }
    		    else
    		    {
    		    	System.out.println("The result for title: " + "'" + searchString + "'" + " is listed above");
    		    }
    }
    
    /**
     * Method use to remove books. Before the book will be removed from array list it is going to be moved to the different one
     * called deletedBook.
     * @param id ID of the book that will be deleted
     * @return Array List of deleted books
     */
    
    public ArrayList<Book> removedBook (int id)
    {
   	 Iterator<Book> it = bookList.iterator();
   	 boolean found = false;
   	 while(it.hasNext())
   	 {
   	 Book element = it.next();
   	 if(id == element.getIdBook())
   	 {
   	   	found = true;	 
     	deletedBook.add(element);
     	it.remove();
   	 }
 
   	 }
   	 	if (found == true)
   	 	{
   	 		System.out.println("The book with ID: " + id + " has been removed.");
   	 	}
   	 	else {
   	 		System.out.println("There is no book with ID: " + id);
   	 	}
      	 return deletedBook;
    }

    /**
     * Method use to print all removed books.
     */
    
    public void printRemovedBooks()
    {
    	
    	System.out.println("The number of deleted books " + deletedBook.size());
    	for(Book element : deletedBook)
        {
    		System.out.println(element.toString());
        }
    }

	/**
	 * Method use to loan the book to the member. It will add current date while loan has been completed and also generate date to return
	 * the book.  
	 * @param idMember ID of the member that will borrow the book
	 * @param idBook ID of the borrowed book
	 * @throws ParseException parse a String to a Date Object
	 */
    public void newLoan (int idMember, int idBook) throws ParseException
    {
    	Date today = new Date();
//		Set up today date to 01 January 2022 to check if overdue loans works.
//    	today = sdf.parse("2022-01-01");
    	Calendar overdueDate = Calendar.getInstance();
        overdueDate.setTime(today);
    	overdueDate.add(Calendar.DATE, 21);
    	Date overdue = overdueDate.getTime();
    	Member idM = returnMemberId(idMember);
    	Book idB = returnBookId(idBook);
    	Iterator<Book> it = availableBook.iterator();
    	Iterator<Member> it2 = memberList.iterator();
    	boolean found = false;
    	while(it.hasNext() && it2.hasNext())
    	{
    		idB = it.next();
    		if(idBook == idB.getIdBook() && idMember == idM.getIdMember())
    		{
    			found = true;	 
    			onLoan.add(new Loan(idM, idB, today, overdue));     
    			it.remove();
    		} 

    	}
    	if (found == true)
    	{
    		System.out.println("The book with ID: " + idBook + " has been loaned by member with ID: " + idMember);
    	}
		else if (idMember != idM.getIdMember())
		{
			System.out.println("The looking member with ID: " + idMember + " does not exixt ");
		}
    	else 
    	{
    		System.out.println("The book with ID: " + idBook + " is not available to loan.");
    	}
    }
	 
	 /**
	  * Method use to print books on loan.
	  */
	 public void onLoanList()
	 {
		 System.out.println("The list of all books on loan:");
		 int index = 0;
		 while(index < onLoan.size()) 
		 {	
			 System.out.println(onLoan.get(index));
		            index++;
		 }
	 }
	 
	 /**
	  * Method use to print available books to loan.
	  */
	 
	 public void printAvailableBooks()
	 {
	    	
		 System.out.println("The number of available books to borrow: " + availableBook.size());
		 for(Book element : availableBook)
		 {
			 System.out.println(element.toString());
		 }
	 }
	 
	 /**
	  * Method use to return the book from the loan. 
	  * @param idBook ID of the returned book
	  */
	 public void returnLoan (int idBook)
	    {

		 	boolean found = false;
		 	for (int i = 0; i < onLoan.size(); i++)
		 	{
		 		Loan element = onLoan.get(i);
		 		Book book = element.getIdBook();
		 		int idB = book.getIdBook();
		 		if (idB == idBook)
		 		{
		 			found = true;
		 			onLoan.remove(i);
		 			availableBook.add(book);
		 		}
		 	}
		 	if (found == true)
	    	{
	    		System.out.println("The book with ID: " + idBook + " has been returned.");
	    	}
	    	else 
	    	{
	    		System.out.println("The book with ID: " + idBook + " has not been loaned.");
	    	}
	    }
	 
	 
	 /**
	  * Method to print all of the overdue loans.
	  */
	 public void overdueLoan()
	 {
		 System.out.println("The list with the overdue loans: " );
		 int index = 0;
		 while(index < onLoan.size()) 
		 {
			 Date today = new Date();
			 Loan ovd = onLoan.get(index);
			 Date overdueDate = ovd.getOverdue();
			 

			 if (today.after(overdueDate))
			 {
				 System.out.println(onLoan.get(index) + ". Today date is: " + sdf.format(today));
		         index++;
			 }
			 
		 }

	 }
	 

	 
    
}