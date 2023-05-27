package select;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicate {
	
	
	//BY Using hashSet From DropDown
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///D:/HTML/singalLevalDropdown.html");
		WebElement dropdown = driver.findElement(By.name("menu"));
		
		//To handel DropDown Create Object of Select class
	       Select sel = new Select(dropdown);
	       
	       //To get all the options from DropDown
	      List<WebElement> alloptions = sel.getOptions();
	       
	       //To eliminate the duplicates and maintain the order of insertion we use
	              HashSet<String> Hs = new HashSet<String>();
	            
	        // to read the list by eliminate duplicates..
	            for(int i=0; i<alloptions.size();i++)
	            {
	            	// get the option and text of Options
	            	String op = alloptions.get(i).getText();
	            	
	            	// add the text of options to TreeSet
	            	Hs.add(op);
	            }
	            
	            //to read the options form set
	            for( String options:Hs)
	            {
	            	Thread.sleep(2000);
	            	System.out.println(options);
	            }
	            
 }         

}
