package Framework.Hybrid.TestScripts;

import org.testng.annotations.Test;
import Framework.Hybrid.applib.*;
public class TestLibMercury {
	
	  @Test()
	  public void LoginTest()
	  {
		MercuryLibClass.loginmercury("userid", "pwd");
	  }

}
