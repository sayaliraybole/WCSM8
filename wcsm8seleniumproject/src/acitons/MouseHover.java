package acitons;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.selenium.dev/downloads/");
		 WebElement target = driver.findElement(By.linkText("4.9.0"));
		 
		 // To perform House Action WE need to create object
		Actions act = new Actions(driver);
		
		// To Right click Action
		
		act.contextClick(target).perform();
	}
}
