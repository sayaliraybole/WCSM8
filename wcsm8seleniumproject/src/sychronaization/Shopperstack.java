package sychronaization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Shopperstack {
         public static void main(String[] args) throws InterruptedException {
			
        	 ChromeOptions co =new ChromeOptions();
             co.addArguments("--remote-allow-origins=*");
            	
             WebDriver driver= new ChromeDriver(co);
            	
             driver.manage().window().maximize();
             
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
             driver.get("https://www.shoppersstack.com/");
             
             driver.findElement(By.xpath("//span[text()='Noise ColorFit Pulse Spo2 Smart Watch']")).click();
             driver.findElement(By.id("Check Delivery")).sendKeys("123456");
             Thread.sleep(2000);
             driver.findElement(By.name("Check")).click();
             
		}
}
