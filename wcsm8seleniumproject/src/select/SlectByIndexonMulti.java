package select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SlectByIndexonMulti {
	
	public static void main(String[] args) throws InterruptedException {
		
			
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.get("file:///D:/HTML/multiLevelDropdown.html");
			  WebElement dropDown = driver.findElement(By.name("menu"));
			     Select sel = new Select(dropDown);
			     sel.selectByIndex(8);
			     
			     //multiSelect dropdown
			     for (int i=0; i<=6; i++);
			     {
			    	sel.selectByIndex(0);
			    	Thread.sleep(2000);
			     }
	}

}
