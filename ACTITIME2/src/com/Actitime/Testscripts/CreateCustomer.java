
package com.Actitime.Testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Actitime.GenericLabrary.BaseClass;
import com.Actitime.pom.Homepage;
import com.Actitime.pom.Taskpage;
@Listeners(com.Actitime.GenericLabrary.LisnerImplimentatiopn.class)

public class CreateCustomer extends BaseClass
{
	
	@Test
	public void createCustomer() throws EncryptedDocumentException, IOException, InterruptedException  {
	Homepage hp=new Homepage(driver);
	hp.task();
	
	Taskpage tp=new Taskpage(driver);
	tp.addnew();
	}
	

}
