package acitons;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DragAndDrop {

	public static void main(String[] args) {
	 WebDriver driver	= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 
	 driver.get("http://demo.gure99.com/test/drag-drop.html");
	}
}
