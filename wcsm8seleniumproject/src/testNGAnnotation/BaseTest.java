package testNGAnnotation;

import java.time.Duration;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {
	static WebDriver driver;
  @BeforeMethod
  public void SetUp() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://hp/login.do");
 }
  
  public void failedMethod()
  {
	TakesScreenshot ts =  (TakesScreenshot)driver;
	
  }
}
