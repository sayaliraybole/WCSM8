package methodofWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetMethod {
  

//get use to launch webApplication
	
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("WebDriver.chrome.driver","./drivers/chromeDriver.exe");
	
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	
	WebDriver driver=new ChromeDriver(co);
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	driver.get("http://omayo.blogspot.com/");
	
	
	
		
	}
}
