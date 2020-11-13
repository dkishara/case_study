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
    @DataProvider(name = "Data_Provider")
    public Object[] [] dataProvider() {
        return new Object[] [] {
                {"1234","Melbourne VIC, Australia","80000","Ishara","Chaminda","0772586662","test@villvay.com"}
        };
    }
    @AfterMethod
    void after(){
        driver.close();
    }
}
