package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserType {

	@AfterTest // BeforeTest & AfterTest scope is within the test level of the xml
	public void afTest() {
		System.out.println("Run this After Test");
	}

	@BeforeTest
	public void bfTest() {
		System.out.println("Run this Before Test");
	}

	@BeforeSuite // @BeforeSuite & @AfterSuite scope is within the suite level of the xml
	public void bfSuite() {
		System.out.println("It will first because it is before suite");
	}

	@AfterSuite
	public void afSuite() {
		System.out.println("It will last because it is after suite");
	}

	@Parameters({ "CommonURL" })
	@Test(groups = { "Smoke" })
	public void chromebrowser(String url) {
		System.out.println("Chrome");
		System.out.println("Common url: " + url);
	}

	@Test(timeOut = 4000) // this will wait for 4 secs and if not executed within 4sec this test will fail
	public void firefoxbrowser() {
		System.out.println("Firefox");
	}

	@Test(dependsOnMethods = { "firefoxbrowser" }) // this will run only after firefoxbrowser method has been executed
	public void edgebrowser() { // it can depend on mutilple methods as well like
		System.out.println("Edge"); // {"firefoxbrowser","chromebrowser"}
	}

	@Test(enabled = false) // if false it will not run, if true it will run
	public void safaribrowser() {
		System.out.println("Safari");
	}
}
