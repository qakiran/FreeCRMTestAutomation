package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage extends TestBase {
    //variables
    @FindBy(xpath = "//div[@class='ui header item mb5 light-black']")
    WebElement contactsLabel;

    @FindBy(xpath = "//i[@class='edit icon']")
    WebElement createNewContact;

    @FindBy(xpath = "//i[@class='download icon']")
    WebElement exportContactList;

    @FindBy(xpath = "//button[@class='ui linkedin button'][1]")
    WebElement showFilters;


    //constructor
    public ContactsPage() {
        PageFactory.initElements(driver, this); //all vars in this class will be init with this driver
    }


    //methods
    public boolean verifyContactsPageLabel(){
        return contactsLabel.isDisplayed();
    }

    public NewContact createNewContact() {
        contactsLabel.click();
        return new NewContact();
    }


}
