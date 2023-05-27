package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rtp {
	static WebDriver driver;
		
     public static void main(String[] args) throws InterruptedException {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Select the browser you want");
    	 String browservalue =sc.next();
    	 if(browservalue.equalsIgnoreCase("Chrome"))
    	 {
    		 System.setProperty("Webdriver.chrome.driver","./driver/chromedrriver.exe");
    		 ChromeOptions co=new ChromeOptions();
    		 co.addArguments("---remote_allow_origins=*");
    		 
    		 driver =new ChromeDriver(co);
    		 driver.manage().window().maximize();
    		 Thread.sleep(2000);
    		 driver. close();
        }
    	 else if (browservalue.equalsIgnoreCase("firefox"))
    	 {
    		 System.setProperty("Webdriver.Chrome.driver","./driver/Chromedriver.exe");
    	 driver =new FirefoxDriver();
    	 driver.manage().window().maximize();
    	 Thread.sleep(2000);
    	 driver.close();
    }
     else
     {
    	 System.out.println("select valid browser");
     
     }
    	 
     }

}
