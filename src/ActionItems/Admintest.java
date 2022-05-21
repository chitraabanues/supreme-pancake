package ActionItems;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.Message;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Commonactions.Commontest;
import pageobject.Adminpage;
import pageobject.Loginpage;

public class Admintest extends Commontest {
	
	public void login()
	{
		PageFactory.initElements(driver, Loginpage.class);
		Loginpage.userName.sendKeys(properties.getProperty("username"));
		Loginpage.passWord.sendKeys(properties.getProperty("password"));
		Loginpage.submit.click();
	}
	
		@Test
	public void Admin()
	{ 
		login();
		PageFactory.initElements(driver, Adminpage.class);
		Actions actions=new Actions(driver);
		actions.moveToElement(Adminpage.admin);
		actions.moveToElement(Adminpage.usermanagement);
		actions.moveToElement(Adminpage.users).click().build().perform();
		Select selectrole=new Select(Adminpage.userrole);
		selectrole.selectByIndex(1);
		Select selectstatus=new Select(Adminpage.status);
		selectstatus.selectByIndex(1);
		Adminpage.search.click();
		LOGGER.info("User role dispalyed");
		String userroledata=Adminpage.userroledata.getText();
		LOGGER.info(userroledata);
		String statusdata=Adminpage.statusdata.getText();
		LOGGER.info(statusdata);
		}
	
}
