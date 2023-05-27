package methodofWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetTitle {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.Chrome.driver","./driver//chromedriver.exe");
	
	ChromeOptions co =new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	
	WebDriver driver=new ChromeDriver(co);
	
	driver.get("https://www.instagram.com/");
	String loginPageTitle=driver.getTitle();
	
	System.out.println(loginPageTitle);
 }
}
