package ActionItems;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Commonactions.Commontest;
import pageobject.Dashboardpage;
import pageobject.Loginpage;

public class Dashboardtest extends Commontest {
	public void login()
	{
		PageFactory.initElements(driver, Loginpage.class);
		Loginpage.userName.sendKeys(properties.getProperty("username"));
		Loginpage.passWord.sendKeys(properties.getProperty("password"));
		Loginpage.submit.click();
	}
	
		@Test
		public void dashboard()
		{
			login();
			PageFactory.initElements(driver, Dashboardpage.class);
			Dashboardpage.dashboard.click();
			LOGGER.info("Dashboard page displayed");
			Dashboardpage.pendingrequest.click();
			
		}

}
