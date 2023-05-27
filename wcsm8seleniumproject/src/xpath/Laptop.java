package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Laptop {
	     public static void main(String[] args) throws InterruptedException {
			
	         ChromeOptions co =new ChromeOptions();
	       	co.addArguments("--remote-allow-origins=*");
	       	
	       	WebDriver driver= new ChromeDriver(co);
	       	
	       	driver.manage().window().maximize();
	       	
	       	driver.get("https://www.flipkart.com/");
	       	driver.findElement(By.xpath("//button[text()='✕']")).click();
	       	driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("hp laptop");
	        driver.findElement(By.xpath("//button[@class=\"L0Z3Pu\"]")).click();
	        
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='Core i7')]")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//div[text()='Brand']")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//div[text()='HP']")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//div[text()='Operating System']")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//div[@class='_3879cV' and(text()='Windows 11')]")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//div[text()='4★ & above']")).click();
	        Thread.sleep(2000);
	        String firstsugestionprice=driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[1]")).getText();
            System.out.println(firstsugestionprice);
            driver.quit();
	     }

}
