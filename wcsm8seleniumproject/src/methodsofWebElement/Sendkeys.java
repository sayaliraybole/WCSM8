package methodsofWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys {

	 public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		  WebElement usernameTB = driver.findElement(By.name("username"));
		  usernameTB.sendKeys("admin123");
		  
		   WebElement passwordTB = driver.findElement(By.name("password"));
		   passwordTB.sendKeys("manager123");
		   Thread.sleep(2000);
		   
		   driver.navigate().refresh();
		   usernameTB.sendKeys("manager123");
		   Thread.sleep(2000);
		   passwordTB.sendKeys("admin123");
		   
		   
	}
}
