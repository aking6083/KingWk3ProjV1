/**
 * 
 */
package domain;

import static org.junit.Assert.*;

import java.util.*;

import junit.framework.TestFailure;

import org.junit.Test;

/**
 * @author 1131392334C
 *
 */
public class BookTest {

	public static final String CLASS_NAME = "domain.Book";
	
	public void testname() throws Exception {
		fail();
	}
	
	/**
	 * Test method for {@link domain.Book#setAuthors(java.lang.String)}.
	 */
	@Test
	public void testSetAuthors() {
		Book instance = new Book();
		LinkedList<String>expResult = new LinkedList<String>();
		LinkedList<String>actuals = new LinkedList<String>();

		instance.setAuthors("Adam King");
		instance.setAuthors("Warren Rachelle");
		
		expResult.add("Adam King");
		expResult.add("Warren Rachelle");
		actuals = instance.getAuthors();
		
		assertEquals(expResult, actuals);
		
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link domain.Book#getAuthors()}.
	 */
	@Test
	public void testGetAuthors() {
		Book instance = new Book();
		LinkedList<String>expResult = new LinkedList<String>();
		LinkedList<String>actuals = new LinkedList<String>();

		instance.setAuthors("Adam King");
		instance.setAuthors("Warren Rachelle");
		
		expResult.add("Adam King");
		expResult.add("Warren Rachelle");
		actuals = instance.getAuthors();
		
		assertEquals(expResult, actuals);
		
	}

	/**
	 * Test method for {@link domain.Book#setIsbn(java.lang.String)}.
	 */
	@Test
	public void testSetIsbn() {
		Book instance = new Book();
		instance.setIsbn("3231979");
		String expResult = "3231979";
		String actual = instance.getIsbn();
		assertEquals(expResult, actual);
	}

	/**
	 * Test method for {@link domain.Book#getIsbn()}.
	 */
	@Test
	public void testGetIsbn() {
		Book instance = new Book("Adam King","Code How I Do","3231979");
		String expResult = "3231979";
		String actual = instance.getIsbn();
		assertEquals(expResult, actual);
	}

	/**
	 * Test method for {@link domain.Book#setTitle(java.lang.String)}.
	 */
	@Test
	public void testSetTitle() {
		Book instance = new Book();
		instance.setTitle("Code How I Do");
		String expResult = "Code How I Do";
		String actual = instance.getTitle();
		assertEquals(expResult, actual);
	}
	

	/**
	 * Test method for {@link domain.Book#getTitle()}.
	 */
	@Test
	public void testGetTitle() {
		Book instance = new Book("Adam King","Code How I Do","3231979");
		String expResult = "Code How I Do";
		String actual = instance.getTitle();
		assertEquals(expResult, actual);
	}

	/**
	 * Test method for {@link domain.Book#Book()}.
	 */
	@Test
	public void testBook() {
		Object instance = new Book();
		if (instance instanceof Book) {
			 assertTrue(true);
		}
		else 
			assertFalse(false);
		
	}

	/**
	 * Test method for {@link domain.Book#validate()}.
	 */
	@Test
	public void testValidate() {
		Book instance = new Book();
		boolean expResult = false;
		boolean actual = instance.validate();
		assertEquals(expResult,actual);
		
		//test true
		instance.setAuthors("Adam King");
		instance.setTitle("Code How I Do");
		instance.setIsbn("3231979");
		actual = instance.validate();
		assertEquals("expected true", true, actual);
		
		
	}

	/**
	 * Test method for {@link domain.Book#equals(java.lang.Object)}.
	 */
	@Test
	public void testEqualsObject() {
		Object obj = new Book("Adam King","Code How I Do", "3231979");
		Book instance = (Book) obj;
		boolean expResult = true;
		boolean actual = instance.equals(obj);
		assertEquals(expResult,actual);
	}

	/**
	 * Test method for {@link domain.Book#isInteger(java.lang.String)}.
	 */
	@Test
	public void testIsInteger() {
		String intString = "abcd123";
		boolean expResult = false;
		boolean actual = Book.isInteger(intString);
		assertEquals(expResult, actual);
		
		intString = "3231979";
		expResult = true;
		actual = Book.isInteger(intString);
		assertEquals(expResult, actual);
		
	}

}
