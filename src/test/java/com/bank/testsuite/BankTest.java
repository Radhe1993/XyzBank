package com.bank.testsuite;

import com.bank.pages.AddCustomerPage;
import com.bank.pages.BankManagerLoginPage;
import com.bank.testbase.BaseTest;
import org.testng.annotations.Test;

public class BankTest extends BaseTest
{
    AddCustomerPage addPage = new AddCustomerPage();
    BankManagerLoginPage bank = new BankManagerLoginPage();

    @Test
    public void bankManagerShouldAddCustomerSuccessfully()
    {
        addPage. login();
        addPage.setAddCustomer();
        addPage.setFirstName();
        addPage.setLastName();
        addPage. setPostCode();
        addPage.setButton();
        addPage. setPopUp();
    }

    @Test
    public void bankManagerShouldOpenAccountSuccessfully()
    {
        bank. setBank();
        bank.setOpenAccount();
        bank.setCustomer();
        bank.pound();
        bank.setProcess();
        bank.setPopUp();
    }
}
