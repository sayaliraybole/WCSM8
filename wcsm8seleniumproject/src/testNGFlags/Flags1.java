package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flags1 {
	
	//To describe the method
  @Test(description="This Method Performs Logi!!")
  public void Method1() {
	  Reporter.log("method");
  }
}
