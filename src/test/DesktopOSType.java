package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DesktopOSType {

	@BeforeMethod
	public void bfMethod() {
		System.out.println("This will before every Method");
	}

	@AfterMethod // @BeforeMethod & @AfterMethod scope is within the methods of the class in
					// which they are defined
	public void afMethod() {
		System.out.println("This will after every Method");
	}

	@Parameters({ "WindowsTestUrl" })
	@Test(groups = { "Smoke" })
	public void windowsdevice(String windowUrl) {
		System.out.println("Windows");
		System.out.println(" this is Windows url: " + windowUrl);
	}

	@Test
	public void iOSdevice() {
		System.out.println("Mac");
	}
}
