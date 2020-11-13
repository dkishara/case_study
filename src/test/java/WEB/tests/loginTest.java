package WEB.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import WEB.pages.homePage;
import WEB.pages.loginPage;

public class loginTest extends BaseTest{
    @Test
    void loginTest() throws InterruptedException {
        homePage home = PageFactory.initElements(driver,homePage.class);
        loginPage login = PageFactory.initElements(driver,loginPage.class);

        home.clickSignIn();
        login.fillEmail("isa.chamin@gmail.com");
        login.fillPassowrd("Sdet1234");
        login.clickSignInButton();
        Thread.sleep(5000);
    }

}
