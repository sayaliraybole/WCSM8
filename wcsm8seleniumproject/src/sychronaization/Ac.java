package sychronaization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import methodofWebDriver.GetTitle;

public class Ac {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
    	
        driver.manage().window().maximize();
    
        driver.get("http://127.0.0.1/login.do;jsessionid=2c6c6g1p0v7e");
       
         // String title = driver.getTitle();
          //System.out.println(title);
          if(driver.getTitle().equals("actiTIME - Login"))
          {
        	  System.out.println("Test case is pass");
        	  
        	  driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("admin");
        	  driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys("manager");
        	  driver.findElement(By.xpath("//a[@id=\"loginButton\"]")).click();
          }
          
          String title = driver.getTitle();
          System.out.println(title);
          
          if(driver.getTitle().equals("actiTIME - Enter Time-Track"))
          {
        	  System.out.println("Test case is pass");
          }
          
          

          
          
          
       
	}
}
