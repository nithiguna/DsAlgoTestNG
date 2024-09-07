package tree_ds_algo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tree_Module_Page {
	WebDriver driver;

	@FindBy(xpath ="(//a[text()='Get Started'])[6]")
	WebElement get_Started_tree_page;
	
	@FindBy(xpath ="//a[text()='Overview of Trees']")
	WebElement overview_trees;

	@FindBy(xpath ="//a[text()='Try here>>>']")
	WebElement try_here;
	
	public void get_Started_tree_page() {
		get_Started_tree_page.click();
	}
	
	public void overview_trees() {
		overview_trees.click();
	}
	public void try_here() {
		try_here.click();
	}
	public Tree_Module_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	

}
