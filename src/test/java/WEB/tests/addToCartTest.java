package WEB.tests;

import WEB.pages.homePage;
import WEB.pages.loginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import WEB.pages.homePage;
import WEB.pages.loginPage;
import WEB.pages.productPage;

public class addToCartTest extends BaseTest{
    @Test(dataProvider = "Data_Provider_2")
    void addToCartTest(String fname, String lname, String email, String pass) throws InterruptedException {
        int cartItemsBefore;
        homePage home = PageFactory.initElements(driver,homePage.class);
        loginPage login = PageFactory.initElements(driver,loginPage.class);
        productPage prod = PageFactory.initElements(driver,productPage.class);

        home.clickSignIn();
        login.fillEmail(email);
        login.fillPassowrd(pass);
        login.clickSignInButton();
        Thread.sleep(2000);
        try {
            cartItemsBefore = Integer.valueOf(home.getCartItemCount());
        }catch(Exception e){
            cartItemsBefore = 0;
        }
        home.clickSecondItem();
        prod.clickSizeMedium();
        prod.clickColourBlue();
        prod.clickAddToCartButton();
        Thread.sleep(4000);
        int cartItems = Integer.valueOf(home.getCartItemCount());
        System.out.println(cartItemsBefore);
        System.out.println(cartItems);
        Thread.sleep(5000);
    }

    @Test
    void guestAddTocartTest() throws InterruptedException {
        homePage home = PageFactory.initElements(driver,homePage.class);
        loginPage login = PageFactory.initElements(driver,loginPage.class);
        productPage prod = PageFactory.initElements(driver,productPage.class);
        home.clickSecondItem();
        prod.clickSizeMedium();
        prod.clickColourBlue();
        prod.clickAddToCartButton();
        Thread.sleep(3000);
        int cartItems = Integer.valueOf(home.getCartItemCount());
        System.out.println(cartItems);
        Assert.assertEquals(cartItems,1);
        Thread.sleep(5000);
    }
}
