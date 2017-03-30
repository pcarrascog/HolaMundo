package cl.tsoft.test;

import org.junit.Assert;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	   @Test
	   public void openBlazeMeterTest() {
	       Chromedriver driver = new ChromeDriver();
	       driver.get("http://blazemeter.com");
	       WebElement title = driver.findElement(By.xpath("//title"));
	       System.out.println("********************************************************");
	       System.out.println("*" + title.getAttribute("text") + "*");
	       System.out.println("********************************************************");
	       driver.quit();
	   }
/*
	@Test
	public void testLengthOfTheUniqueKey() {

		App obj = new App();
		Assert.assertEquals(36, obj.generateUniqueKey().length());

	}
	
	@Test
	public void testOfTheKeyIsAlphanumeric() {
		App obj = new App();
		Assert.assertEquals(36, obj.generateUniqueKey().length());
	}
	
	@Test
	public void testOfKeyisEquals() {
		App obj = new App();
		Assert.assertEquals(36, obj.generateUniqueKey().length());
	}	

	@Test
	public void testOfKeyisDistinct() {
		App obj = new App();
		Assert.assertEquals(36, obj.generateUniqueKey().length());
	}
	
	@Test 
	public void testOfKeyisNewStatus() {
		App obj = new App();
		Assert.assertEquals(36, obj.generateUniqueKey().length());
		
	}
	
	@Test 
	public void testOfKeyisNewStatus_1() {
		App obj = new App();
		Assert.assertEquals(36, obj.generateUniqueKey().length());
		
	}
	*/
}