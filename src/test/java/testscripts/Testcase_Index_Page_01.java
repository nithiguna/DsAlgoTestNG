package testscripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ds_algo_page.Index_Page;
import resource_browser.Browser_Launch_Quit;



public class Testcase_Index_Page_01 extends Browser_Launch_Quit{

	@Test
	@Parameters("browser")
	public void index()
		{
		Index_Page ip=new Index_Page(driver);
		ip.get_started_button();
			
		}
	}

