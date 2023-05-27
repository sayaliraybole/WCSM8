package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Classname {
   public static void main(String[] args) throws InterruptedException {
	 
	   ChromeOptions co=new ChromeOptions();
	   co.addArguments("--remote-allow-origins=*");
	   
	   WebDriver driver=new ChromeDriver(co);
	   
	   driver.get("https://www.google.com");
	   Thread.sleep(2000);
	   
	   driver.switchTo().activeElement().sendKeys("chandler bing",Keys.ENTER);
	   
	   driver.findElement(By.className("lNPNe")).click();
	   }
}
