package account;

import org.testng.annotations.Test;

import scripts.BaseClass;
/***
 * 
 * @author Sumanth
 *
 */
public class TC_Account_002 extends BaseClass{   // test case id

	@Test(groups= {"smoke","functional"})
	public void modifyAccount() {  // test case name
		driver.get("https://www.myvi.in/");
	}
}
