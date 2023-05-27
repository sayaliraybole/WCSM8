package testNGpack2;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Test3Method {
  @Test
  public void test3method() {
	  
	  WebDriver driver =new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  driver.get("https://WWW.google.com");
	
	  driver.switchTo().activeElement().sendKeys("selenium",Keys.ENTER);
  }
}
