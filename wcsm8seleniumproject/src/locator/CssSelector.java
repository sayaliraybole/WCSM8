package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CssSelector {
    public static void main(String[] args) throws InterruptedException {
		
    	ChromeOptions co=new ChromeOptions();
    	co.addArguments("--remote-allow-origins=*");
    	
    	WebDriver driver=new ChromeDriver(co);
    	
    	driver.manage().window().maximize();
    	driver.get("https://www.instagram.com/");
    	Thread.sleep(2000);
    	
    	driver.findElement(By.name("username")).sendKeys("sayo_24_07");
    	Thread.sleep(2000);
    	driver.findElement(By.name("password")).sendKeys("sayo112456");
    	Thread.sleep(2000);
    	
    	driver.findElement(By.cssSelector("button[class='_acan _acap _acas _aj1-']")).click();
    	
    	
    
	}
}
