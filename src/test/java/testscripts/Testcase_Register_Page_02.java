package testscripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ds_algo_page.Index_Page;
import ds_algo_page.Register_Page;
import resource_browser.Browser_Launch_Quit;

public class Testcase_Register_Page_02 extends Browser_Launch_Quit{
	@Test(dataProvider="Login", dataProviderClass=utilities.Data_Login.class)
	@Parameters("browser")
	public void register(String username,String password,String confirm_pwd)
		{
		Index_Page ip=new Index_Page(driver);
		ip.get_started_button();
		Register_Page rp=new Register_Page(driver);
		rp.homepage_register_button();
		rp.username(username);
		rp.password(password);
		rp.confirm_password(confirm_pwd);
		rp.register_button();
		}
	
}
