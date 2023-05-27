package sychronaization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Laptops {
  
	  public static void main(String[] args) {
		
		  ChromeOptions co =new ChromeOptions();
	       	co.addArguments("--remote-allow-origins=*");
	       	
	       	WebDriver driver= new ChromeDriver(co);
	       	
	       	driver.manage().window().maximize();
	       	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       	
	       	driver.get("https://www.flipkart.com/");
	       	driver.findElement(By.xpath("//button[text()='✕']")).click();
	       	driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("hp laptop");
	        driver.findElement(By.xpath("//button[@class=\"L0Z3Pu\"]")).click();
	        
	       
	        driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='Core i7')]")).click();
	        
	        driver.findElement(By.xpath("//div[text()='Brand']")).click();
	        
	        driver.findElement(By.xpath("//div[text()='HP']")).click();
	       
	        driver.findElement(By.xpath("//div[text()='Operating System']")).click();
	        
	        driver.findElement(By.xpath("//div[@class='_3879cV' and(text()='Windows 11')]")).click();
	       
	        driver.findElement(By.xpath("//div[text()='4★ & above']")).click();
	        
	      String firstsugestionprice=driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[1]")).getText();
          System.out.println(firstsugestionprice);
          driver.quit();

	}
}
