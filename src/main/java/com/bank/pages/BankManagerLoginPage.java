package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility
{
    By bank = By.xpath("//button[contains(text(),'Bank Manager Login')]");
    By openAccount = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/button[2]");
    By customer = By.xpath("//select[@id='userSelect']");
    By pound = By.xpath("//select[@id='currency']");
    By process = By.xpath("//button[contains(text(),'Process')]");
    By popUp;

    public void setBank()
    {
        clickOnElement(bank);
    }
    public void setOpenAccount()
    {
        clickOnElement(openAccount);
    }
    public void setCustomer()
    {
       sendTextToElement(customer,"ram sita");
    }
    public void pound()
    {
        selectByVAlueFromDropDown(pound,"Pound");
    }
    public void setProcess()
    {
        clickOnElement(process);

    }
    public void setPopUp()
    {
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
    }

}
