package account;

import org.testng.annotations.Test;

import scripts.BaseClass;
/***
 * 
 * @author Sumanth
 *
 */
public class TC_Account_003 extends BaseClass{   // test case id

	@Test(groups="functional")
	public void deleteAccount() {  // test case name
		driver.get("https://www.jio.com/");
	}
}
