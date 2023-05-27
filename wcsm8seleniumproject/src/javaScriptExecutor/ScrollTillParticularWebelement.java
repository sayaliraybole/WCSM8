package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import methodsofWebElement.GetLocation;

public class ScrollTillParticularWebelement {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", "./drivers/chromedriver.exc");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--disble-notification");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://in.puma.com/in/en/mens/mens-shoes/mens-shoes-running");
		WebElement shoes = driver.findElement(By.xpath(""));
		
		Point point = shoes.getLocation();
		int xaxis=point
}
}
