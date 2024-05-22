import java.text.ParseException;

/**
 * A class to test program functions.
 * 
 * 
 * @author Konrad Glowacki
 * @version 29/03/2022
 *
 */

public class Tester {
	
	/**
	 * Constructor for objects of class Tester
	 */
	public Tester()
	{
		
	}

	/**
	 * List of the function created in this program that will be executed.
	 * @throws ParseException parse a String to a Date Object
	 */
	public void test() throws ParseException
	{
		Library a = new Library(); 

		
		System.out.println("======================= User Requirements Set A  ========================");
		System.out.println();
		System.out.println();
		System.out.println("======================== ADD NEW MEMBERS =========================");
		populateWithDataMembers(a);
		System.out.println();
		System.out.println("============== PRINT DETAILS OF THE MEMBER USING ID ==============");
		a.showMemberId(2);
		System.out.println();
		System.out.println("======================= PRINT ALL MEMBERS ========================");
		a.printAllMembers();
		System.out.println();
		System.out.println("==================== PRINT NUMBER OF MEMBERS ====================="); // extra
		System.out.println(a.numberOfMembers());
		System.out.println();
		System.out.println("========================= ADD NEW BOOKS ==========================");
		populateWithDataBooks(a);
		System.out.println();
		System.out.println("=============== PRINT DETAILS OF THE BOOK USING ID ===============");
		a.showBook(4);
		System.out.println();
		System.out.println("======================== PRINT ALL BOOKS =========================");
		a.printAllBooks();
		System.out.println();
		System.out.println();
		System.out.println("===================== PRINT NUMBER OF BOOKS ======================"); // extra
		System.out.println(a.numberOfBooks());
		System.out.println();
		System.out.println();
		System.out.println("======================= User Requirements Set B  ========================");
		System.out.println();
		System.out.println();
		System.out.println("======================= RETURN MEMBER ID =========================");
		a.returnMemberId(2);
		System.out.println();
		System.out.println("================ PRINT MEMBER BY HIS/HER SURNAME =================");
		a.showMemberLastName("Le");
		System.out.println();
		System.out.println("=================== REMOVE THE MEMBER USING ID ===================");
		a.removedMembers(3);
		a.removedMembers(30);
		System.out.println();
		System.out.println("===================== PRINT REMOVED MEMBERS ======================"); // extra
		a.printRemovedMembers();
		System.out.println();
		System.out.println("======================== RETURN BOOK ID ==========================");
		a.returnBookId(4);
		System.out.println();
		System.out.println("==================== PRINT BOOK BY IIS TITLE =====================");
		a.showBookTitle("Harry");
		System.out.println();
		System.out.println("==================== REMOVE THE BOOK USING ID ====================");
		a.removedBook(3);
		a.removedBook(30);
		System.out.println();
		System.out.println("====================== PRINT REMOVED BOOKS ======================="); // extra
		a.printRemovedBooks();
		System.out.println();
		System.out.println();
		System.out.println("======================= User Requirements Set C  ========================");
		System.out.println();
		System.out.println();
		System.out.println("========================= ADD NEW LOAN ===========================");
		populateWithDataLoans(a);
		System.out.println();
		System.out.println("========================= REMOVE A LOAN ==========================");
		a.returnLoan(5);
		a.returnLoan(4);
		a.returnLoan(9);
		System.out.println();
		System.out.println("======================== PRINT ALL LOAN ==========================");
		a.onLoanList();
		System.out.println();
		System.out.println("===================== PRINT AVAILABLE BOOKS ======================"); // extra
		a.printAvailableBooks();
		System.out.println();
		System.out.println();
		System.out.println("======================= User Requirements Set D  ========================");
		System.out.println();
		System.out.println();
		System.out.println("===================== PRINT OVERDUE LOANS =======================");
		a.overdueLoan();
	}
	
	
	/**
	 * Method to add the members to the library
	 */
    private void populateWithDataMembers(Library c)
    {
    	
        c.join("John", "See", "01234567890");
        c.join("Eva", "Evans", "02345676543");
        c.join("Adam", "Lee", "02018123432");
        c.join("Kate", "Cooper", "01243252016");
        c.join("Cris", "Lemon", "02856492020");
        c.join("Cris", "Lemon", "abc492020");
        c.join("Mark", "Apple", "92020");
    }
    
	/**
	 * Method to add the books to the library
	 */
    private void populateWithDataBooks(Library c)
    {
    	
        c.addBook("William Shakespeare", "Hamlet", "Non-Fiction");
        c.addBook("William Shakespeare", "Romeo and Juliet", "Non-Fiction");
        c.addBook("J. K. Rowling", "Harry Potter and the Philosopher's Stone", "Fiction");
        c.addBook("J. K. Rowling", "Harry Potter and the Chamber of Secrets", "Fiction");
        c.addBook("J. K. Rowling", "Harry Potter and the Prisoner of Azkaban", "Fiction");
    } 
    
	/**
	 * Method to add the book loans by the library members
	 */
    private void populateWithDataLoans(Library c) throws ParseException
    {
    	
    	c.newLoan(2, 5);
    	c.newLoan(2, 4);
    	c.newLoan(5, 5);
    	c.newLoan(5, 1);
    	c.newLoan(5, 2);
    	c.newLoan(5, 3);
    	c.newLoan(5, 20);
    	c.newLoan(50, 2);
    } 
	
	
	/**
	 * The application's entry point
	 * @param args an array of command-line arguments for the application
	 * @throws ParseException parse a String to a Date Object
	 */
	public static void main(String args[]) throws ParseException 
	{
		
		Tester test = new Tester();
		
		test.test();


	}
	
}
