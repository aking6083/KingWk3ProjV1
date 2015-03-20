/*    
    Book.java ~ The Book Class holds String variables of auhtor,isbn, and
                title.
                Class will store multiple author names in a  LinkedList<String> data structure
                
    @author Adam King
    @version 1
*/

package domain;
import java.util.*;

public class Book 
{
    private String author;
    private String isbn;
    private String title;
    private LinkedList<String> authors;
    
    /*     
    @param setAuthors() ~ sets the authors in a linked list.
    
  */
    
    public void setAuthors(String authorName) throws NullPointerException
    {
        try //See if the LinkedList has been made yet 
        {
            this.authors.add(authorName); //Will fail on un-instaniated lists
        }
        catch(NullPointerException npe)
        {
            authors = new LinkedList<String>();
            this.authors.add(authorName);
        }
    }
    
    public LinkedList<String> getAuthors()
    {return this.authors;}
        
    public void setIsbn(String newIsbn)
    {this.isbn = newIsbn;}
        
    public String getIsbn()
    {return this.isbn;}
    
    public void setTitle(String newTitle)
    {this.title = newTitle;}
    
    public String getTitle()
    {return this.title;}
    
    public Book()
    {
       this.title = "";
       this.author = "";
       this.isbn = "";
    }
    
    public Book(String author, String title, String isbn)
    {
    	this.author = author;
    	this.title = title;
    	this.isbn = isbn;
    
    }
    /*     
      @param validate() ~ validates fields for non empty strings and checks that
                          isbn is only integers.
      @return true if all fields are valid.
    */
    
    public Boolean validate()
    {
        boolean validAuthor = false;
        boolean validTitle = false;
        boolean validIsbn = false;
        
        //Validate the data members
                
        //Validate author is not empty
        if (this.authors != null && !this.authors.isEmpty())
            validAuthor = true;
                        
        //Validate title is not empty
        if (this.title != null && !this.title.isEmpty())
            validTitle = true;
        
        //Validate isbn is numbers only
        if ( isInteger(this.isbn))
           validIsbn = true;
                
        //Is everything valid?    
        if (validAuthor && validTitle && validIsbn)
            return true;
        else
            return false;
    }
    
    @Override
    /*
      @param equals() ~ compares al objects fields returns true if they care 
                        all the same
      @return true if objects are equal
    
    */
    
    public boolean equals(Object obj)
    {
        boolean returnVal = true;
        
        if (this == obj) 
            returnVal =  true;
        
        if ( ! (obj instanceof Book))
            returnVal = false;
        
        Book tmpBook = (Book) obj; //cast object to a book
        
        if (!tmpBook.title.equals(this.title)) 
            returnVal = false;
        
        if ( ! this.title.equals(tmpBook.title) )
            returnVal = false;
        
        if ( ! this.author.equals(tmpBook.author) )
            returnVal = false;
        
        if ( ! this.isbn.equals(tmpBook.isbn) )
            returnVal = false;
        
        return returnVal;
        
    }
        
    /*
        @param isInteger ~ returns true if passed String input has all integers
        @return ~returns true if all chars in array String are integers    
    */
    
    public static boolean isInteger(String input)
    {
        
        //I am sooo glad to be able to use OO again instead of loops everywhere!
        try 
        {
            Integer.parseInt(input);
            
        } catch (NumberFormatException e) {
           //Ne message needed
            return  false;
        }
        return true;
    }

}
