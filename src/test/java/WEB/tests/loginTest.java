package WEB.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import WEB.pages.homePage;
import WEB.pages.loginPage;

public class loginTest extends BaseTest{
    @Test(dataProvider = "Data_Provider")
    void loginTest(String fname, String lname, String email, String pass) throws InterruptedException {
        homePage home = PageFactory.initElements(driver,homePage.class);
        loginPage login = PageFactory.initElements(driver,loginPage.class);
        home.clickSignIn();
        login.fillEmail(email);
        login.fillPassowrd(pass);
        login.clickSignInButton();
        Thread.sleep(4000);
        String welcomeMsg =  home.getWelcomeMessage();
        System.out.println(welcomeMsg);
        Assert.assertTrue(welcomeMsg.contains(fname + " " + lname));
        Thread.sleep(5000);
    }

}
