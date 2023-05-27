package methodofWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElement {
    public static void main(String[] args) throws InterruptedException {
		
  	   ChromeOptions co=new ChromeOptions();
	    co.addArguments("--remote-allow-origins=*");
	    
	    WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("http://hp/login.do");
		Thread.sleep(2000);
		WebElement usernameTextBox=driver.findElement(By.name("username"));
		usernameTextBox.sendKeys("admin");
		
		System.out.println(usernameTextBox);

   }
}