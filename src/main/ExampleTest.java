package main;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
public class ExampleTest {
	
	public WebDriver chromeDriver;
 
    @Test
    public void testA() throws Exception {
 
        System.out.println("Test finished.");
 
    }
    
    @BeforeTest
	public void beforeTestsetUp(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jagrelot\\Desktop\\chromedriver.exe");
		chromeDriver = new ChromeDriver();
	}
	
	@Test(priority=1,description="Verify Login")
	public void loginTest(){
		
		WebElement  userName;
		WebElement  passWord;
		WebElement     login;
		
		chromeDriver.get("https://na59.salesforce.com");
		userName = chromeDriver.findElement(By.cssSelector("#username"));
		passWord = chromeDriver.findElement(By.cssSelector("#password"));
		login    = chromeDriver.findElement(By.cssSelector("#Login"));
		userName.sendKeys("jagrelot@orgdemo.com");
		passWord.sendKeys("acumen321");
		login.click();
	
	}
}