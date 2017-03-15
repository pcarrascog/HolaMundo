package cl.tsoft.test;

//import junit.framework.Test;
//import junit.framework.TestCase;
//import junit.framework.TestSuite;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	@Test
	public void testLengthOfTheUniqueKey() {

		App obj = new App();
		Assert.assertEquals(36, obj.generateUniqueKey().length());

	}
	@Test
	public void testOfTheKeyIsAlphanumeric() {
		App obj = new App();
		Assert.assertEquals(36, obj.generalUniqueKey().length());
	}
}