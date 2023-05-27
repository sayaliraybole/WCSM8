package methodofWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class QuitMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.driver", "./driver/ChromeDriver.exe");
		
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-orginas=*");
		
		WebDriver driver= new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.xpath("//a[.=open a popup window"));
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}

}
