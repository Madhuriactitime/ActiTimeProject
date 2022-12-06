package com.Actitime.pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Actitime.GenericLabrary.ReadDataFromExcel;

public class Taskpage
{
@FindBy(xpath="//div[.='Add New']")
private WebElement addnew;

@FindBy(xpath="//div[.='+ New Customer']")
private WebElement newcustomer;

@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
private WebElement custname;

@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
private WebElement discrption;

@FindBy(xpath="(//div[@class='dropdownButton'])[15]")
private WebElement dropdown;

@FindBy(xpath="(//div[.='Anushka Sharma'])[2]")
private WebElement bbccompany;

@FindBy(xpath="//div[.='Create Customer']")
private WebElement createcustomer;



public WebElement getAddnew() {
	return addnew;
}


public WebElement getNewcustomer() {
	return newcustomer;
}


public WebElement getCustname() {
	return custname;
}


public WebElement getDiscrption() {
	return discrption;
}


public WebElement getDropdown() {
	return dropdown;
}
public WebElement getCreatecustomer() {
	return createcustomer;
}


public WebElement getBbccompany() {
	return bbccompany;
}

public Taskpage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}


public void addnew() throws EncryptedDocumentException, IOException, InterruptedException
{
	ReadDataFromExcel r=new ReadDataFromExcel();
	String cstomerName = r.readDataFromExcelFile("Sheet1", 1, 1);
	String domain = r.readDataFromExcelFile("Sheet1", 1, 2);
	addnew.click();
	newcustomer.click();
	custname.sendKeys(cstomerName);
	Thread.sleep(3000);//HDFC-001
	discrption.sendKeys(domain);//banking
	dropdown.click();
	bbccompany.click();
	createcustomer.click();
}

}