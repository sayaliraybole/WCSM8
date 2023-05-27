package methodofWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SwitchTo {
      public static void main(String[] args) {
		
    	  ChromeOptions co=new ChromeOptions();
  	    co.addArguments("--remote-allow-origins=*");
  	    
  	    WebDriver driver=new ChromeDriver(co);
  		driver.manage().window().maximize();

  		driver.switchTo().activeElement().sendKeys("java,keys,ENTER");
	}
}
