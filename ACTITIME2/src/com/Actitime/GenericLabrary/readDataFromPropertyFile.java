package com.Actitime.GenericLabrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readDataFromPropertyFile
{
	public String readDataFromProperty(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream("./testdata/commondata1.property");
		Properties p= new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
	}
}
