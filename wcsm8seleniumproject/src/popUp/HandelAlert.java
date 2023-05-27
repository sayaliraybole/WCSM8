package popUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelAlert {
	
	public static void main(String[] args) throws InterruptedException {
		
	 WebDriver	driver =new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 
	 driver.get("file:///D:/HTML/Alert.html");
	 
	 //genarate to PopUp
	 driver.findElement(By.xpath("//button[.='click me!']")).click();
	 
	 //handel alert popup
	 Alert alt = driver.switchTo().alert();
	 Thread.sleep(2000);
	 
	 //to print popup
	 System.out.println(alt.getText());
	 alt.dismiss();
	 
	}

}
