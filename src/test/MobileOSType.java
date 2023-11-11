package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MobileOSType {
	// @BeforeClass & @AfterClass scope is within the methods of the class in which
	// they are defined

	// based on the alphabetically order of methods test are executed within a class
	@BeforeClass
	public void bfClass() {
		System.out.println("This will execute before any method of this class MobileOSType");
	}

	@AfterClass
	public void afClass() {
		System.out.println("This will execute after any method of this class MobileOSType");
	}

	@Test(groups = { "Smoke" })
	public void androiddevice() {
		System.out.println("Android");
	}

	@Test
	public void iOSMobiledevice() {
		System.out.println("iOS_mobile");
	}
}
