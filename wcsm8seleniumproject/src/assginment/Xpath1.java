package assginment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath1 {
      public static void main(String[] args) throws InterruptedException {
    	  
    	  ChromeOptions co =new ChromeOptions();
      	co.addArguments("--remote-allow-origins=*");
      	
      	WebDriver driver= new ChromeDriver(co);
      	
      	driver.manage().window().maximize();
      	
      	
      	driver.get("https://www.facebook.com/");
      	Thread.sleep(2000);
      	
      	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sayaliraybole@gmail.com");
      	Thread.sleep(2000);
      	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sayali2407");
      	Thread.sleep(2000);    	
      	
	
    }
}
