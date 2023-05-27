package acitons;


import java.time.Duration;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickMethod {
	
	public static void main(String[] args) {
		
		WebDriver driver =new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/store.html");
		WebElement target = driver.findElement(By.xpath("Rings"));
		
		Actions act = new Actions(driver);
		act.contextClick(target).perform();
	}

}
