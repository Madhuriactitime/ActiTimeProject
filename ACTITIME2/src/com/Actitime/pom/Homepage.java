package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
	@FindBy(xpath="//a[.='Logout']")
	private WebElement logoutlink;
	
	@FindBy(xpath = "//div[.='Tasks']")
	private WebElement task;
	
	@FindBy(id="container_reports")
	private WebElement reports;
	
	@FindBy (id="container_users")
	private WebElement users;
	//constructor
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogoutlink() {
		return logoutlink;
	}

	public WebElement getTask() {
		return task;
	}

	public WebElement getReports() {
		return reports;
	}

	public WebElement getUsers() {
		return users;
	}
	
public void logout()
{
	logoutlink.click();
}
public void task()
{
	task.click();
}
public void reports()
{
	reports.click();
}
public void users() 
{
	users.click();
}
}

