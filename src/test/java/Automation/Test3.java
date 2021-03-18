package Automation;


import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
	
	 WebDriver driver = null;
	 String SystemMessage1 = "Test 3: Preparing for test";
	 String SystemMessage2 = "Test 3: Opening Browser";
	 String SystemMessage3 = "Test 3: Closing Browser";
	 
	 String messageExample =  "Testing for Exception";
	 Message message  = new Message(messageExample);

	    @BeforeTest
	    public void SetUpTest() {
	        System.setProperty("webdriver.chrome.driver", "/Users/keyvu/IdeaProjects/chromedriver.exe");
	        System.out.println(SystemMessage1);
	        driver = new ChromeDriver();
	    }

	    @org.testng.annotations.Test(expectedExceptions =AssertionError.class)
	    public void BeginTest() throws InterruptedException {

	        System.out.println(SystemMessage2);
	        driver.get("htwww.yahyfyfyfyyg");
	        
	        WebElement element = driver.findElement(By.name("p"));
	        
	        
	        element.sendKeys("TCS Automated Test 3!!!");
	        Thread.sleep(1000);

	        element.submit();
	        
	        Assert.assertEquals(SystemMessage1, messageExample);

	    }

	    @AfterTest
	    public void AfterTest() throws InterruptedException {
	        System.out.println(SystemMessage3);
	        Thread.sleep(8000);
	        driver.quit();
	        System.out.println("Test Completed!!");


	    }

}
