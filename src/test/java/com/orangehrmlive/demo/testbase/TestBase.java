package com.orangehrmlive.demo.testbase;

import com.orangehrmlive.demo.propertyreader.PropertyReader;
import com.orangehrmlive.demo.utility.Utility;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

public class TestBase extends Utility {
String browser = PropertyReader.getInstance().getProperty("browser");
@BeforeMethod
public void setUp(){
selectBrowser(browser);
}
@AfterClass
public void tearDown(){
//closeBrowser();
}
}