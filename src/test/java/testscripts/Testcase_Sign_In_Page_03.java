package testscripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ds_algo_page.Index_Page;
import ds_algo_page.Register_Page;
import ds_algo_page.Sign_In_Page_Sign_Out_Page;
import resource_browser.Browser_Launch_Quit;

public class Testcase_Sign_In_Page_03 extends Browser_Launch_Quit{
	@Test(dataProvider="Login", dataProviderClass=utilities.Data_Login.class)
	@Parameters("browser")
	public void sign_in(String username,String password,String confirm_pwd)
		{
		Index_Page ip=new Index_Page(driver);
		ip.get_started_button();
		Sign_In_Page_Sign_Out_Page si_so=new Sign_In_Page_Sign_Out_Page(driver);
		si_so.sign_in();
		Register_Page rp=new Register_Page(driver);
		rp.username(username);
		rp.sign_in_password(password);
		si_so.sign_in_page_login();
		si_so.numpy_logo();
}
}
