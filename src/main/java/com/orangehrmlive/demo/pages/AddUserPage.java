package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.orangehrmlive.demo.driverfactory.ManageDriver.driver;

public class AddUserPage extends Utility {

    By userRole = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]");
    By EmployeeName = By.xpath("//input[@placeholder='Type for hints...']");
    By user = By.xpath("//div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]");
    By adminOption = By.xpath("//*[@class='oxd-select-wrapper']//*[contains(text(), 'Admin')]");
    By userNm = By.xpath("//div[@class='oxd-form-row']/div[1]/div[4]/div[1]/div[2]/input");

    By nam = By.xpath("//*[@class='oxd-autocomplete-wrapper']//*[contains(text(),'Paul  Collings')]");
    By StatusDropDown = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]");
   By disabledOption = By.xpath("//*[@class='oxd-select-wrapper']//*[contains(text(),'Disabled')]");
    By passWd = By.xpath("//div[@class='oxd-form-row user-password-row']/div[1]/div[1]/div[1]/div[2]/input");

    By confirmPw = By.xpath("//div[@class='oxd-form-row user-password-row']/div[1]/div[2]/div[1]/div[2]/input");
    By SaveButton = By.xpath("//button[normalize-space()='Save']");
    By CancleButton = By.xpath("//button[normalize-space()='Cancel']");
    By Dropdown = By.xpath("//div[@class='oxd-grid-2 orangehrm-full-width-grid']//div[1]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]");

    public void selectUserRoleAdmin() throws InterruptedException {
       clickOnElement(userRole);
       Thread.sleep(1000);
          clickOnElement(adminOption);
          sendTextToElement(user,"Admin");
        }
    public void enterEmployeeName() throws InterruptedException
    {
        sendTextToElement(EmployeeName,"P");
        Thread.sleep(1000);
        clickOnElement(nam);

    }
    public void enterUserName(String name){
        //clearTextToElement(userName);
        sendTextToElement(userNm,name);
    }
    public void clickStatusDropDown1() throws InterruptedException {
        clickOnElement(StatusDropDown);
        Thread.sleep(1000);
        clickOnElement(disabledOption);
    }

    public void enterPasswordField(String pswd){sendTextToElement(passWd,pswd);}
    public void enterConfirmPasswordField(String pswd){sendTextToElement(confirmPw,pswd);}
    public void clickSaveButton(){clickOnElement(SaveButton);}
    public void clickCancleButton(){clickOnElement(CancleButton);}
    public void clickDropdown(){clickOnElement(Dropdown);}

}
/*User Role Drop Down, Employee Name, Username, Status Drop Down,
Password, Confirm Password,
Save and Cancle Button Locators and it's actions*/