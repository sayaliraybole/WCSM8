package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {
  @Test
  public void f() {
	  Reporter.log("f Method",true);
  }
  
  @Test
  public void a() {
	  Reporter.log("a method",true);
  }
  
  @Test
  public void d() {
	  Reporter.log("d method",true);
  }
  
  @Test
  public void s() {
	  Reporter.log("s method",true);
  }
  
  @Test
  public void p() {
	  Reporter.log("p method",true);
  }
  
  @Test
  public void z() {
	  Reporter.log("z method",true);
  }
  
  @Test
  public void k() {
	  Reporter.log("k method",true);
  }

}
