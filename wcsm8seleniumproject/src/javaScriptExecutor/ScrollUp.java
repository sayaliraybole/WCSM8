package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUp {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.instagram.com/");
		
		// To perform scrolling operations....
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		Thread.sleep(2000);
		
		//scroll down
		jse.executeScript("window.scrollBy(0,350)");
		
		Thread.sleep(2000);
		 
		//scroll Up
		 jse.executeScript("window.scrollBy(0,-350)");
	}

}
