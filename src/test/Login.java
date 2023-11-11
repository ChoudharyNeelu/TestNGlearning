package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login {
	@Test(dataProvider = "getData")
	public void SignIn(String username, String password) {
		System.out.println("Sign in");
		System.out.println(username + "   " + password);
	}

	@DataProvider
	public Object[][] getData() {
		/*
		 * Suppose we have to test against 4 comibinations of username & passwprd data
		 * 1st: funame fpasswd for valid username & passwpord 2nd: wsname spasswd for
		 * invalid username 3rd: tuname wtpasswd for invalid password 4th: wfuname
		 * wfpasswd for invalid username & passwpord
		 */

		// defining the Object array to store these values
		Object[][] data = new Object[4][2]; // 4-->rows for different cases 2--->columns for username & password
		// 1st set
		data[0][0] = "fname";
		data[0][1] = "fpasswd";
		// 2nd set
		data[1][0] = "wsname";
		data[1][1] = "spasswd";
		// 3rd set
		data[2][0] = "tuname";
		data[2][1] = "wtpasswd";
		// 4th set
		data[3][0] = "wfuname";
		data[3][1] = "wfpasswd";
		return data;
	}
}
