package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath2 {
	
   public static void main(String[] args) throws InterruptedException {
	
	   ChromeOptions co =new ChromeOptions();
    	co.addArguments("--remote-allow-origins=*");

        WebDriver driver=new ChromeDriver(co);
   	    driver.manage().window().maximize();
   	    
   	    driver.get("https://in.puma.com/in/en");
   	    Thread.sleep(2000);
   	    
   	    driver.findElement(By.xpath("//span[text()=\"Men\"]")).click();
   	    Thread.sleep(4000);
   	    
   	    driver.findElement(By.xpath("")).click();
   	    Thread.sleep(2000);
   	    driver.quit();
  }

}
