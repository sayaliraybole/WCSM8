package takescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Ss2 {
		
		public static void main(String[] args) throws IOException {

			ChromeDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			//consider we are taking ss of selenium.dev wp
			driver.get("https://www.selenium.dev/");
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			
			//implementation of method
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("./Screenshots/ss2.png");
			
			Files.copy(src, dest);

	}
}
