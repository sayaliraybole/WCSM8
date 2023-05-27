package popUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelConfirmstionPopUp {
	
	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver	driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("file:///D:/HTML/ConfirmmationPopUP.html");
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		// to handel confirmmastion popup
		Alert alt = driver.switchTo().alert();
		 Thread.sleep(2000);
		 alt.accept();
		// String text = alt.getText();
		 

}
}