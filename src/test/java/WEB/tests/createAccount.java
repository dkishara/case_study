package WEB.tests;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import WEB.pages.homePage;
import WEB.pages.createAccountPage;
import WEB.pages.myAccountPage;

public class createAccount extends BaseTest{
    @Test
    void createAccountTest() throws InterruptedException {
        homePage home = PageFactory.initElements(driver,homePage.class);
        createAccountPage createAcc = PageFactory.initElements(driver,createAccountPage.class);
        myAccountPage myAcc = PageFactory.initElements(driver,myAccountPage.class);
        home.ClickCreateAccount();
        createAcc.fillFirstName("firstname");
        createAcc.fillLastName("lastname");
        createAcc.fillEmail("abc@mymailx.com");
        createAcc.fillPassword("Sdet1234");
        createAcc.fillConfirmPassword("Sdet1234");
        createAcc.clickCreateAccountButton();
        String emaildata = myAcc.getEmailFiled();
        System.out.println(emaildata);
        Thread.sleep(2000);
    }

}
