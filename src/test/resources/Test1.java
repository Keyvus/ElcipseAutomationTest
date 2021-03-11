import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;





public class Test1 {
	
	WebDriver driver = null;


    @BeforeTest
    public void SetUpTest() {
        System.setProperty("webdriver.chrome.driver", "/Users/keyvu/IdeaProjects/chromedriver.exe");
        System.out.println("Preparing for Test 1");
        driver = new ChromeDriver();
    }

    @org.testng.annotations.Test
    public void BeginTest() throws InterruptedException {

        System.out.println("Test 1 :Opening Chrome");
        driver.get("http://www.google.com");

        WebElement element = driver.findElement(By.name("q"));

        element.sendKeys("TCS Automated Test 1!!!");
        Thread.sleep(1000);

        element.submit();

    }

    @AfterTest
    public void AfterTest() throws InterruptedException {
        System.out.println("Closing Chrome");
        Thread.sleep(8000);
        driver.quit();
        System.out.println("Test Completed!!");


    }

}
