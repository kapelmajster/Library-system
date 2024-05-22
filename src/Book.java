/**
 * A class that represent a Book.
 * 
 * 
 * @author Konrad Glowacki
 * @version 29/03/2022
 * 
 */
public class Book {
	
	// The name of the book's author.
		private String author;
		// The name of the book.
		private String title;
		// The type of the book.
		private String type;
		// The ID of the book.
		private int idBook;
		
		/**
		 * Constructor for objects of class Book
		 */
		public Book()
		{
			author = "";
			title = "";
			type = "";
			idBook = 1;
		}
		
		/**
		 * Constructor to initialise book objects.
		 * @param author Name of the book's author
		 * @param title Name of the book
		 * @param type fiction type of the book, either fiction or non-fiction 
		 * @param id Book's ID
		 */
		public Book(String author, String title, String type, int id)
		{
			// Validation for id parameter
			
			if (id < 0)
			{
				System.out.println("The ID number must be positive");
			}
			else
			{
			this.author = author;
			this.title = title;
			this.type = type;
			this.idBook = id;
			}
		}
		
		
	    /**
	     * Return first name of the author
	     * @return The first name of the author.
	     */
	    public String getAuthor()
	    {
	        return author;
	    }
	    
		 /**
		  * Mutator method to change author of the book.
		  * @param newAuthor New author's name 
		  */
	    public void setAuthor(String newAuthor)
	    {
	    	author = newAuthor;
	    }
	    
	    /**
	     * Return title of the book
	     * @return The book's title.
	     */
	    public String getTitle()
	    {
	        return title;
	    }
	    
		 /**
		  * Mutator method to change title of the book.
		  * @param newTitle New book's title
		  */
	    public void setTitle(String newTitle)
	    {
	    	title = newTitle;
	    }
	    
	    /**
	     * Return book's type
	     * @return The book's type.
	     */
	    public String getType()
	    {
	    
	        return type;
	    }
	    
		 /**
		  * Mutator method to change type of the book.
		  * @param newType New book's type
		  */
	    public void setType(String newType)
	    {
	    	type = newType;
	    }
		
	    /**
	     * Return book's ID
	     * @return The book's ID.
	     */
	    public int getIdBook()
	    {
	        return idBook;
	    }
	    
		 /**
		  * Mutator method to change id of the book.
		  * @param newId Book's new ID
		  */
	    public void setIdBook(int newId)
	    {
	    	idBook = newId;
	    }

	    /**
	     * A string representation of the book.
	     */

		public String toString() 
		{
			return "Author: " + author + ", Title: " + title + ", type: " + type + ", Book ID: " + idBook;
		}


}
