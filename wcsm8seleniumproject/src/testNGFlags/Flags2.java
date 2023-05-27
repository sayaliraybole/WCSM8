package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flags2 {
	
	// Method or Annotation is Enabled or Disabled
	
  @Test(enabled = false,description = "login Method")
  public void Method1() {
	  Reporter.log("login perfomed!!",true);
  }
  
  @Test(enabled = true,description = "logout Method")
  public void Method2() {
	  Reporter.log("logout perfomed!!",true);
  }

}
