package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class AdminPage extends Utility {

    By UserManagement = By.xpath("//span[normalize-space()='User Management']");
    By Job = By.xpath("//span[normalize-space()='Job']");
    By OrganizationTabs=By.xpath("//span[normalize-space()='Organization']");

    public void clickUserManagement(){clickOnElement(UserManagement);}
    public void clickJob(){clickOnElement(Job);}
    public void clickOrganizationTabs(){clickOnElement(OrganizationTabs);}
}
//- UserManagement, Job, Organization Tabs