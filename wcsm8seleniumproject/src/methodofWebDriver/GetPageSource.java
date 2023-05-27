package methodofWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetPageSource {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","./driver//Chromedriver.exe");
		
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
       WebDriver driver=new ChromeDriver(co);	
       
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		String Scode=driver.getPageSource();
		System.out.println(Scode);
		
	}

}
