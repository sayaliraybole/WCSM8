package methodsofWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.jdi.Value;

public class GetAttribute {
 
	 public static void main(String[] args) {
		
	   WebDriver driver = new ChromeDriver();
	   
	   driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
        driver.get("https://www.selenium.dev/downloads/");	
        
          WebElement value = driver.findElement(By.xpath("//h1[text()='Downloads']"));
            String classvalue = value.getAttribute("class");
            System.out.println("classvalue");
          
	}
}
