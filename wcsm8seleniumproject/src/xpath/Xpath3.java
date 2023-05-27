package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions co =new ChromeOptions();
    	co.addArguments("--remote-allow-origins=*");

        WebDriver driver=new ChromeDriver(co);
   	    driver.manage().window().maximize();
   	    
   	    driver.get("https://www.airindia.in/index.htm");
   	    Thread.sleep(2000);
   	   
   	    driver.findElement(By.xpath("//input[@placeholder=\"From\"]")).sendKeys("pune");
   	    Thread.sleep(5000);
   	    driver.findElement(By.xpath("//a[contains(text(),'Pune, Lohegaon Airport, PNQ, India, IN')]")).click();
   	    
   	    
   	    driver.findElement(By.xpath("//input[@id=\"to\"]")).sendKeys("Mumbai");
   	    Thread.sleep(5000);
   	    driver.findElement(By.xpath("//a[ contains(text(),'Mumbai, Chhatrapati Shivaji International Airport, BOM, India, IN')]")).click();
   	    
   	   
   	    driver.findElement(By.xpath("//input[contains(@title,'Departing')]")).click();
   	    Thread.sleep(5000);
   	    driver.findElement(By.xpath("//a [contains(@class,'ui-state-default ui-state-highlight ')]")).click(); 
   	    
   	    
   	    driver.findElement(By.xpath("//input[contains(@title,'Returning'])")).click();
   	    Thread.sleep(2000);
   	    driver.findElement(By.xpath("//a[contains(@class,'ui-state-default ui-state-active'])")).click();
   	    
	
	
	}

}
