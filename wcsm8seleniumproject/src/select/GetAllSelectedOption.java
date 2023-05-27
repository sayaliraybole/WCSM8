package select;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOption {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver  driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///D:/HTML/singalLevalDropdown.html");
		WebElement dropdown = driver.findElement(By.name("menu"));
	       Select sel = new Select(dropdown);
	       
	       //How to Select Multiple Options
	       
	       for(int i=0;i<5;i++)
	       {
	    	   Thread.sleep(2000);
	    	   sel.selectByIndex(i);
	       }
	       
	        List<WebElement> allOption = sel.getAllSelectedOptions();
	        for(WebElement op:allOption)
	        {
	        	  String option = op.getText();
	        	  System.out.println(option);
	        }
	        
 }
}