package WEB.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver = null;
    public static String WebURL = "https://m2.leanscale.com/";
    //before method for all tests
    @BeforeMethod
    void before(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        driver.get(WebURL);
        System.out.println("Before method");
    }

    //data provider for registration
    //data format first name, last name, email, password
    @DataProvider(name = "Data_Provider_1")
    public Object[] [] dataProvider() {
        return new Object[] [] {
                {"ishaass","chamniiss","ixas12345@gmail.com","Sdet1234"}
        };
    }

    //data provider for login and same email reuse
    //data format first name, last name, email, password
    @DataProvider(name = "Data_Provider_2")
    public Object[] [] dataProvider2() {
        return new Object[] [] {
                {"ishara","chaminda","isa.chamin@gmail.com","Sdet1234"},
                {"ixa","cham","ixa@gmail.com","Sdet1234"},
                {"ixaa","chama","ixaa@gmail.com","Sdet1234"},
                {"ixi","chami","ixai@gmail.com","Sdet1234"}
        };
    }

    @AfterMethod
    void after(){
        driver.close();
    }
}
