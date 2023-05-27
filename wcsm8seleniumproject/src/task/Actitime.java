package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Actitime {
      public static void main(String[] args) throws InterruptedException {
		
    	  ChromeOptions co = new ChromeOptions();
    		co.addArguments("--remote-allow-origins=*");
    		
    		WebDriver driver=new ChromeDriver(co);
    		driver.manage().window().maximize();
    		
    		driver.get("http://hp/login.do");
    		Thread.sleep(2000);
    		
    		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("admin");
    		Thread.sleep(2000);
    		
    		driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys("manager");
    		Thread.sleep(2000);
    		
    		driver.findElement(By.xpath("//a[@id=\"loginButton\"]")).click();

	}
}
