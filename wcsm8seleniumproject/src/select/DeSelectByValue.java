package select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectByValue {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///D:/HTML/multiLevelDropdown.htm");
		 WebElement dropdown = driver.findElement(By.name("menu"));
		
		 //To multiple Opetion
		Select sel = new Select(dropdown);
		for(int i=0; i<8; i++);
		{
			if (i%2==0)
			{
				Thread.sleep(2000);
				sel.selectByValue("v4");
			}
			else {
				System.out.println("its odd place");
			}
		}
		
		//Deselect the Opetion
		
		for(int i=0; i<8; i++)
		{
			if(i%2 ==0)
		}
	}
}
