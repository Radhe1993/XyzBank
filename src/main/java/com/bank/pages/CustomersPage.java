package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomersPage extends Utility
{
    By customer = By.xpath("//button[contains(text(),'Customer Login')]");
    By search = By.xpath("//select[@id='userSelect']");
    By button = By.xpath("//button[contains(text(),'Login')]");
    By deposit = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[3]/button[2]");
    By amount = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]");
    By depositButton = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]");
    By message = By.xpath("//span[contains(text(),'Deposit Successful')]");

    public void setCustomer()
    {
        clickOnElement(customer);
    }
    public void setSearch()
    {
        sendTextToElement(search,"Hermoine Granger");
    }
    public void setButton()
    {
        clickOnElement(button);
    }
    public void setDeposit()
    {
        clickOnElement(deposit);
    }
    public void setAmount()
    {
        sendTextToElement(amount,"100");
    }
    public void setDepositButton()
    {
        clickOnElement(depositButton);
    }
    public void setMessage()
    {
        getTextFromElement(message);
    }

}
