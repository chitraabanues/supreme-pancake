package Commonactions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.internal.PropertiesFile;
import org.w3c.dom.DOMConfiguration;

import net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable;

public class Commontest {
	public static Properties properties=null;
	public static WebDriver driver=null;
	
	protected static final Logger LOGGER = LogManager.getLogger(Commontest.class);
	
	public Properties loadproperty() throws IOException
	{
		FileInputStream fileInputStream=new FileInputStream("config.properties");
		 properties=new Properties();
		 properties.load(fileInputStream);
		return properties;
	}
   
	
	@BeforeSuite
	public void launchbrowser() throws IOException
	{
		loadproperty();
		String driver_location=properties.getProperty("driverlocation");
		String Url=properties.getProperty("url");
		System.setProperty("Webdriver.driver.chromedriver", driver_location);
		LOGGER.info("Launching the Browser");
		driver=new ChromeDriver();
		driver.get(Url);
		driver.manage().window().maximize();
		
	}
	/*@AfterSuite
	public void closebrowser()
	{
		driver.quit();
	}*/
	

	}

