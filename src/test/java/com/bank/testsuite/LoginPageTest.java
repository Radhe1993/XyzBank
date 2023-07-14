package com.bank.testsuite;

import com.bank.pages.CustomerLoginPage;
import com.bank.pages.CustomersPage;
import com.bank.pages.OpenAccountPage;
import com.bank.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest
{
    CustomerLoginPage login = new CustomerLoginPage();
    CustomersPage page = new CustomersPage();
    OpenAccountPage open = new OpenAccountPage();

    @Test
    public void customerShouldLoginAndLogoutSuceessfully()
    {
        login.setCustomer();
        login.setSearch();
        login.setButton();
        login.logout();
        login.click();
        login.setYourName();
        String expected1 = "Your Name :";
        String actual1 = getTextFromElement(By.xpath("//label[contains(text(),'Your Name :')]"));
        Assert.assertEquals(actual1,expected1);
    }

    @Test
    public void customerShouldDepositMoneySuccessfully()
    {
        page.setCustomer();
        page.setSearch();
        page.setButton();
        page.setDeposit();
        page.setAmount();
        page.setDepositButton();
        page.setMessage();
        String expected = "Deposit Successful";
        String actual = getTextFromElement(By.xpath("//span[contains(text(),'Deposit Successful')]"));
        Assert.assertEquals(actual,expected);

    }
    @Test
    public void customerShouldWithdrawMoneySuccessfully()
    {
        open.setCustomer();
        open.setSearch();
        open.setButton();
        open.setWithdraw();
        open.amount();
        open.setWithdrawButton();
        open.getMessage();
    }

}
