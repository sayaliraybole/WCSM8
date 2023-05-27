package select;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import methodsofWebElement.GetText;

public class GetOption {

		public static void main(String[] args) {
			
			WebDriver  driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.get("file:///D:/HTML/singalLevalDropdown.html");
			WebElement dropdown = driver.findElement(By.name("menu"));
		       Select sel = new Select(dropdown);
		         List<WebElement> allOption = sel.getOptions();
		         
		         //To read the list of webElement use looping statements
		         
		         for(int i=0; i<allOption.size();i++)
		         {
		        	 String Option = allOption.get(i).getText();
	        	 System.out.println(Option);
	         }
		         
		         
		         
	}
}
