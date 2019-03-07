package mavenProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class GoogleTest {
	WebDriver driver;
	
  @Test
  public void launchTest() {
	  
	  
	  String expected="Google";
	  String actual=driver.getTitle();
	  Assert.assertEquals(actual, expected);
	  
  }
  @BeforeTest
  public void launchAppTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.google.com");
  }

  @AfterTest
  public void browserCloseTest() {
	  
	  driver.quit();
  }

}
