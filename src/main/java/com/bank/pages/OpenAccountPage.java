package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility
{
    By customer = By.xpath("//button[contains(text(),'Customer Login')]");
    By search = By.xpath("//select[@id='userSelect']");
    By button = By.xpath("//button[contains(text(),'Login')]");
    By withdraw = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[3]/button[3]");
    By amount = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]");
    By withdrawButton = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]");
    By message = By.xpath("//span[contains(text(),'Transaction successful')]");


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
    public void setWithdraw()
    {
        clickOnElement(withdraw);
    }
    public void amount()
    {
       remove(amount);
       sendTextToElement(amount,"50");
    }
    public void setWithdrawButton()
    {
        clickOnElement(withdrawButton);
    }
    public void getMessage()
    {
        getTextFromElement(message);
    }
}
