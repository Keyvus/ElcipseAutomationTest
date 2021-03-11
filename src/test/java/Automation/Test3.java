package Automation;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
	
	 WebDriver driver = null;


	    @BeforeTest
	    public void SetUpTest() {
	        System.setProperty("webdriver.chrome.driver", "/Users/keyvu/IdeaProjects/chromedriver.exe");
	        System.out.println("Preparing for Test 3");
	        driver = new ChromeDriver();
	    }

	    @org.testng.annotations.Test
	    public void BeginTest() throws InterruptedException {

	        System.out.println("Test 3:Opening Browser");
	        driver.get("http://www.yahoo.com");

	        WebElement element = driver.findElement(By.name("p"));

	        element.sendKeys("TCS Automated Test 3!!!");
	        Thread.sleep(1000);

	        element.submit();

	    }

	    @AfterTest
	    public void AfterTest() throws InterruptedException {
	        System.out.println("Test 3: Closing Chrome");
	        Thread.sleep(8000);
	        driver.quit();
	        System.out.println("Test Completed!!");


	    }

}
