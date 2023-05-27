package methodsofWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {
  
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://127.0.0.1/login.do;jsessionid=qk7odqrk518a");
		 
		  WebElement usernameTB = driver.findElement(By.name("username"));
		  
		    WebElement passwordTB = driver.findElement(By.name("pwd"));
		    
		    usernameTB.sendKeys("admin");
		    passwordTB .sendKeys("manager");
		    Thread.sleep(2000);
		    
		    usernameTB.clear();
		    Thread.sleep(2000);
		    passwordTB.clear();
		    
		    
		    
		    
	}
}
