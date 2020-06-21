package test;

import snake.*;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class PropertiesTest {
	private Properties properties;
	
	@Before
	public void setUp() {
		properties = Properties.Instance();
	}
	
	/*
	 * Purpose : Check two different Properties object have same hash code.
	 * Expected : Check will pass true. 
	 */
	@Test
	public void testSameObject() {
		Properties diffProperties = Properties.Instance();
		assertEquals(properties.hashCode(),diffProperties.hashCode());
	}
	
	/*
	 * Purpose : Check whether Properties's theme can be changed from Dark to Rainbow theme
	 *  after calling Rainbow().
	 * Expected : Check will pass true.
	 */
	@Test
	public void testCheckTheme_1() {
		assertEquals(properties.getTheme(),Theme.Dark);
		properties.Rainbow();
		assertEquals(properties.getTheme(),Theme.Rainbow);
	}
	
	/*
	 * Purpose : Check whether Properties's theme can be changed from Rainbow to Dark theme
	 *  after calling Dark().
	 * Expected : Check will pass true.
	 */
	@Test
	public void testCheckTheme_2() {
		properties.Rainbow();
		assertEquals(properties.getTheme(),Theme.Rainbow);
		properties.Dark();
		assertEquals(properties.getTheme(),Theme.Dark);
	}
	
	/*
	 * Purpose : Check whether Properties's theme can be changed from Dark to Sky theme
	 *  after calling Sky().
	 * Expected : Check will pass true.
	 */
	@Test
	public void testCheckTheme_3() {
		properties.Dark();
		assertEquals(properties.getTheme(),Theme.Dark);
		properties.Sky();
		assertEquals(properties.getTheme(),Theme.Sky);
	}
}
