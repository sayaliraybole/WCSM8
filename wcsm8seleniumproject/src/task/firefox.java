package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {
       public static void main(String[] args) throws InterruptedException {
		
    	   ChromeOptions co=new ChromeOptions();
        	co.addArguments("--remote-allow-origins=*");
       	
       	   WebDriver driver=new FirefoxDriver();
       	
        	driver.manage().window().maximize();
        	driver.get(("https://www.facebook.com/"));
        	Thread.sleep(2000);
        	
        	driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("sayali");
        	Thread.sleep(2000);
        	
        	driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("sayo1124");
        	Thread.sleep(2000);
        	
        	driver.findElement(By.xpath("//button[contains(@name,'login')]")).click();
        	
        	

	}
}
