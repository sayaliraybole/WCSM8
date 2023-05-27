package qsp;


import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;



public class openBrowser {
static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	Scanner sc=new Scanner(System.in);
	System.out.println("Choose a Browser you Want");
	String browservalue=sc.next();
	if (browservalue.equalsIgnoreCase("Chrome")) 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
	}
	else if (browservalue.equalsIgnoreCase("FIREFOX")) 
	{
		driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.close();
	}
	else 
	{
		System.out.println("Choose valid Browser");
	}
}
}
