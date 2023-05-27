package methodsofWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://127.0.0.1/login.do;jsessionid=qk7odqrk518a");
		 
		   driver.findElement(By.name("username")).sendKeys("admin");
		  
		   driver.findElement(By.name("pwd")).sendKeys("manager");
		   Thread.sleep(2000);
		   driver.findElement(By.id("loginButton")).click();

	}

}
