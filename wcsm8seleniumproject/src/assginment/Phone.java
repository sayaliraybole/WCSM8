package assginment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Phone {

	public static void main(String[] args) {
		
		  EdgeOptions eo = new EdgeOptions();
		  eo.addArguments("--remote-allow-origins=*");
		  
		    EdgeDriver driver = new EdgeDriver(eo);
		    driver.manage().window().maximize();
		    
		    driver.get("https://www.flipkart.com/");
		    
		    driver.findElement(By.xpath("//button[text()='✕']")).click();
		    driver.findElement(By.name("q")).sendKeys("Mobile");
		    driver.findElement(By.xpath("//button[@class=\"L0Z3Pu\"]")).click();
		    
		    Thread.sleep(2000);
            List<WebElement> nameofmobiles = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
            List<WebElement> alloptions = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
            
            for(int i=0;i<nameofmobiles.size();i++)
            {
            	String name=nameofmobiles.get(i)getText()
;h            }
		           
     

	}

}
