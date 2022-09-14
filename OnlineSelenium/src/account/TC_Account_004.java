package account;

import org.testng.annotations.Test;

import scripts.BaseClass;
/***
 * 
 * @author Sumanth
 *
 */
public class TC_Account_004 extends BaseClass{   // test case id

	@Test(groups="functional")
	public void cloneAccount() {  // test case name
		driver.get("https://www.bsnl.co.in/");
	}
}
