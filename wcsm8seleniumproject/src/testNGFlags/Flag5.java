package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5 {
	
	
  @Test(description = "Login Method")
  public void Method1() {
	  Reporter.log("Login Performed",true);
  }
  
  @Test(description = "CreateUser TestCase")
  public void Method2() {
	  Reporter.log("user Created",true);
  }
  
  @Test(description = "Logout Method")
  public void Method3() {
	  Reporter.log("Logout Performed",true);
  }
}
