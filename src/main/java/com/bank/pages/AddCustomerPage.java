package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility
{
    By login = By.xpath("//button[contains(text(),'Bank Manager Login')]");
    By addCustomer = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]");
    By firstName = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]");
    By lastName = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]");
    By postCode = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/input[1]");
    By button = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/button[1]");
    By popUp ;


    public void login()
    {
        clickOnElement(login);
    }
    public void setAddCustomer()
    {
        clickOnElement(addCustomer);
    }
    public void setFirstName()
    {
        sendTextToElement(firstName,"Sita");
    }
    public void setLastName()
    {
        sendTextToElement(lastName,"Ram");
    }
    public void setPostCode()
    {
        sendTextToElement(postCode,"4556UI");
    }
    public void setButton()
    {
        clickOnElement(button);
    }
    public void setPopUp()
    {
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
    }
}
