package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

class PartiaLinkText {
     public static void main(String[] args) throws InterruptedException {
		
    	 ChromeOptions co=new ChromeOptions();
    	 co.addArguments("--remote-allow-origins=*");
    	 
    	 WebDriver driver=new ChromeDriver(co);
    	 driver.manage().window().maximize();
    	 
    	 driver.get("file:///D:/HTML/Link.html");
    	 driver.findElement(By.partialLinkText("flipcartLink")).click();
    	 
    	 
   }
}
