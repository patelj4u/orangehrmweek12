package com.orangehrmlive.demo.utility;


import com.orangehrmlive.demo.driverfactory.ManageDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static com.orangehrmlive.demo.driverfactory.ManageDriver.driver;

public class Utility extends ManageDriver {
//This method will click on element
public void clickOnElement(By by) {
driver.findElement(by).click();
}
//This method will text from element
public String getTextFromElement(By by) {
return driver.findElement(by).getText();
}
//This method will get text from element for a specific attribute
public String getTextFromElement(By by, String att) {
return driver.findElement(by).getAttribute(att);
}
//This method will send text on element
public void sendTextToElement(By by, String data) {
driver.findElement(by).sendKeys(data);
}

    public void selectByVisibleTextFromDropDown(By by, String text) {
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByVisibleText(text);
    }
//This method will send Clear text Input field
public void clearTextToElement(By by) {
driver.findElement(by).clear();
}
}