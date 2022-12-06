package com.Actitime.GenericLabrary;

import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.Actitime.pom.Homepage;
import com.Actitime.pom.Loginpage;

public class BaseClass 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static WebDriver driver ;
	@BeforeSuite
	public void databaseconnection()
	{
		Reporter.log("database connected",true);
	}
	@AfterSuite
	public void databasedisconnected()
	{
		Reporter.log("database disconnected",true);
	}
	
	@BeforeClass
	public void launchbrowser() throws IOException
	{
		driver= new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		readDataFromPropertyFile r=new readDataFromPropertyFile();
		String URL=r.readDataFromProperty("url");
		driver.get(URL);
		Reporter.log("launch the browser",true);
	}
	
	@AfterClass
	public void closebrowser()
	{

		Reporter.log("close the browser",true);
	}
	@BeforeMethod
	public void login() throws IOException
	{
		readDataFromPropertyFile data =new readDataFromPropertyFile();

		String un = data.readDataFromProperty("username");
		String pw = data.readDataFromProperty("password");
		Loginpage pl=new Loginpage(driver);
		pl.logintoActitime(un, pw);
		Reporter.log("login to application",true);
	}
	@AfterMethod
	public void logout()
	{
		
	
	}
}

