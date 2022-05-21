package pageobject;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Commonactions.Commontest;

public class Adminpage  {
	
	@FindBy(id="menu_admin_viewAdminModule")
	public static WebElement admin;
	
	@FindBy(id="menu_admin_UserManagement")
	public static WebElement usermanagement;
	
	@FindBy(id="menu_admin_viewSystemUsers")
	public static WebElement users;
	
	@FindBy(id="searchSystemUser_userType")
	public static WebElement userrole;
	
	@FindBy(id="searchSystemUser_status")
	public static WebElement status;
	
	@FindBy(id="searchBtn")
	public static WebElement search;
	
	@FindBy(xpath="//table[@id='resultTable']//td[3]")
	public static WebElement userroledata;
	
	@FindBy(xpath="//table[@id='resultTable']//td[5]")
	public static WebElement statusdata;

	
	
	
		
	}


