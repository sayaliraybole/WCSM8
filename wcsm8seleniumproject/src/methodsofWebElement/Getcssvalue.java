package methodsofWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcssvalue {
 
	 public static void main(String[] args) {
		
		 WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("https://www.selenium.dev/downloads/");
	     WebElement button = driver.findElement(By.xpath("//section[@class='row td-box td-box--gradient -bg-selenium-cyan p-2']"));
	     
	       String value = button.getCssValue("fontSize");
	       System.out.println(value);
		 
		 
	}
	 
}
