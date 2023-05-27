package screenshotDynamically;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {
  @Test
  public void property() {
	static WebDriver driver;
  }
  
  @BeforeMethod
  public void setUp()
  {
	driver=new ChromeDriver();
  }
}
