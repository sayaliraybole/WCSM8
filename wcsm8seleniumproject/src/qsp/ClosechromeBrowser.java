package qsp;

import org.openqa.selenium.chrome.ChromeDriver;


public class ClosechromeBrowser {
   public static void main(String[] args) throws InterruptedException {
	   ChromeDriver driver= new ChromeDriver();
	   Thread.sleep(2000);
	   driver.close();
	}
}
