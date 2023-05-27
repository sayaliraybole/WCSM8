package takescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotOfWebElement {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.instagram.com/");
		 WebElement button = driver.findElement(By.xpath("// button[@class=\"_acan _acap _acas _aj1-\"]"));
		
		if (button.isEnabled())
		{
			System.out.println("we can do the login!!");
		}
		else 
		{
			System.out.println("we can not do login!! ss is taken");
			File src = button.getScreenshotAs(OutputType.FILE);
			File dest = new File("./Screenshots/Webelemntss.jpg");
			
			Files.copy(src, dest);
			}
		
	
		
	}
}
