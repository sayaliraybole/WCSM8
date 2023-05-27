package methodofWebDriver;

import java.awt.Point;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Managemethod {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions co=new ChromeOptions();
	    co.addArguments("--remote-allow-origins=*");
	    
	    WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		Dimension targetsize=new Dimension(350,450);
		Thread.sleep(2000);
		driver.manage().window().setSize(targetsize);
	

	}

}
