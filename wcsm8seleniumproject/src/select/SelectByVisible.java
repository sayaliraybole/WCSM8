package select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByVisible {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///D:/HTML/multiLevelDropdown.html");
		  WebElement dropDown = driver.findElement(By.name("menu"));
		     Select sel = new Select(dropDown);
		     Thread.sleep(4000);
		     sel.selectByVisibleText("vadapav");
	}
}
