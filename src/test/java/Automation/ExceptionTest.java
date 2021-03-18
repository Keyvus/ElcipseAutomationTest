package Automation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExceptionTest {
	
	String messageExample = "Keyvus";
	Message message = new Message(messageExample);
	
	@Test(expectedExceptions =ArithmeticException.class)
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		message.printMessage();
	}
	
	@Test
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		messageExample = "Hello" + "Keyvus";
		Assert.assertEquals(messageExample, message.SystemMessage());
		
		
	}
	
	
	
	
	

}
