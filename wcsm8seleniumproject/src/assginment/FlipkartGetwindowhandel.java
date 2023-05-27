package assginment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FlipkartGetwindowhandel {

    public static void main(String[] args) throws InterruptedException {
		
        ChromeOptions co =new ChromeOptions();
      	co.addArguments("--remote-allow-origins=*");
      	
      	WebDriver driver= new ChromeDriver(co);
      	
      	driver.manage().window().maximize();
      	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      	
      	driver.get("https://www.flipkart.com/");
      	driver.findElement(By.xpath("//button[text()='✕']")).click();
      	driver.findElement(By.xpath("//button[@class=\"L0Z3Pu\"]")).click();
        

}
}