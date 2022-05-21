package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboardpage {
	
	@FindBy(id="menu_dashboard_index")
	public static WebElement dashboard;
	
	@FindBy(xpath="//*[@id='task-list-group-panel-menu_holder']//following::td")
	public static WebElement pendingrequest;
	
	

}
