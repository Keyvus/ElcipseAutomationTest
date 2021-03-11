package Automation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	
	WebDriver driver = null;


    @BeforeTest
    public void SetUpTest() {
        System.setProperty("webdriver.chrome.driver", "/Users/keyvu/IdeaProjects/chromedriver.exe");
        System.out.println("Preparing for Test 2");
        driver = new ChromeDriver();
    }

    @org.testng.annotations.Test
    public void BeginTest() throws InterruptedException {

        System.out.println("Test 2: Opening Chrome");
        driver.get("http://www.yahoo.com");

        //Purposely used the wrong element to display failed test
        WebElement element = driver.findElement(By.name("q"));

        element.sendKeys("TCS Automated Test 2!!!");
        Thread.sleep(1000);

        element.submit();

    }

    @AfterTest
    public void AfterTest() throws InterruptedException {
        System.out.println("Closing Chrome");
        Thread.sleep(3000);
        driver.quit();
        System.out.println("Test Completed!!");


    }
}
