package assginment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximaizeChlidBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver	driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("http://omayo.blogspot.com/");
		WebElement link = driver.findElement(By.linkText("Open a popup window"));
		
		Point point = link.getLocation();
	    int xaxis=point.getX();
	     int yaxis=point.getY();
	     
	     //scrolling operation
	     JavascriptExecutor jse=(JavascriptExecutor)driver;
	     jse.executeScript("Window.scrollBy("+xaxis+",+("yaxis-200)+")");	     
	     
}
}