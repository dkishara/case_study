package WEB.tests;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import WEB.pages.homePage;
import WEB.pages.createAccountPage;
import WEB.pages.myAccountPage;

public class createAccount extends BaseTest{
    //Test to Create Account
    @Test(dataProvider = "Data_Provider_1")
    void createAccountTest(String fname, String lname, String email, String pass) throws InterruptedException {
        homePage home = PageFactory.initElements(driver,homePage.class);
        createAccountPage createAcc = PageFactory.initElements(driver,createAccountPage.class);
        myAccountPage myAcc = PageFactory.initElements(driver,myAccountPage.class);
        home.ClickCreateAccount();
        createAcc.fillFirstName(fname);
        createAcc.fillLastName(lname);
        createAcc.fillEmail(email);
        createAcc.fillPassword(pass);
        createAcc.fillConfirmPassword(pass);
        createAcc.clickCreateAccountButton();
        String emaildata = myAcc.getEmailFiled();
        System.out.println(emaildata);
        Assert.assertTrue(emaildata.contains(email));
        Thread.sleep(2000);
    }
    //Test to Create Account With Previously Used Email
    @Test(dataProvider = "Data_Provider_2")
    void sameEmailRegiterTest(String fname, String lname, String email, String pass) throws InterruptedException {
        homePage home = PageFactory.initElements(driver,homePage.class);
        createAccountPage createAcc = PageFactory.initElements(driver,createAccountPage.class);
        myAccountPage myAcc = PageFactory.initElements(driver,myAccountPage.class);
        home.ClickCreateAccount();
        createAcc.fillFirstName(fname);
        createAcc.fillLastName(lname);
        createAcc.fillEmail(email);
        createAcc.fillPassword(pass);
        createAcc.fillConfirmPassword(pass);
        createAcc.clickCreateAccountButton();
        Thread.sleep(2000);
        String validationMessage = createAcc.getValidationMessage();
        System.out.println(validationMessage);
        Assert.assertTrue(validationMessage.contains("already an account with this email address"));
        Thread.sleep(5000);

    }

}
