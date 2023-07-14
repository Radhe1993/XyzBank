package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility
{
    By customer = By.xpath("//button[contains(text(),'Customer Login')]");
    By search = By.xpath("//select[@id='userSelect']");
    By button = By.xpath("//button[contains(text(),'Login')]");
    By logOut = By.xpath("//button[contains(text(),'Logout')]");
    By yourName = By.xpath("//label[contains(text(),'Your Name :')]");

    public void setCustomer()
    {
        clickOnElement(customer);
    }
    public void setSearch()
    {
        sendTextToElement(search,"ram sita");
    }
    public void setButton()
    {
        clickOnElement(button);
    }
    public void logout()
    {
        getTextFromElement(logOut);
    }
    public void click()
    {
        clickOnElement(logOut);
    }
    public void setYourName()
    {
        getTextFromElement(yourName);
    }
}
