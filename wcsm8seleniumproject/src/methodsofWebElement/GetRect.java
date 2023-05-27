package methodsofWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect {

	public static void main(String[] args) {
		
	 WebDriver driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
	  Rectangle Rect = button.getRect();
	  
	  int xaxis=Rect.getX();
	  int yaxis=Rect.getY();
	  System.out.println("x axis: "+xaxis+" y axis:"+yaxis);
	  
	 int H= Rect.getHeight();
	 int w= Rect.getWidth();
	 
	 System.out.println("Height:"+H+" Width:"+w);
	}
}
