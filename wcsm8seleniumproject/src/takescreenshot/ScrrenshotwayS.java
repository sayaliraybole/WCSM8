package takescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScrrenshotwayS {
	public static void main(String[] args) throws IOException {

	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//consider we are taking ss of instagram wp
	driver.get("https://www.instagram.com/");
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	
	//implementation of method
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File("./Screenshots/ss1.png");
	
	Files.copy(src, dest);

}

}
