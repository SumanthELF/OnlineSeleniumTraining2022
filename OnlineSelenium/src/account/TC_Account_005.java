package account;

import org.testng.annotations.Test;

import scripts.BaseClass;
/***
 * 
 * @author Sumanth
 *
 */
public class TC_Account_005 extends BaseClass{   // test case id

	@Test(groups="smoke")
	public void rechargeAccount() {  // test case name
		driver.get("http://www.aircel.com/");
	}
}
