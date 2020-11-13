package WEB.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginPage {
    WebDriver driver=null;
    public loginPage(WebDriver driver){
        this.driver = driver;
    }
    @FindBy(how = How.ID,using = "email")
    WebElement emailFiled;
    public  void fillEmail(String email){
        emailFiled.sendKeys(email);
    }

    @FindBy(how = How.ID,using = "pass")
    WebElement passwordFiled;
    public void fillPassowrd(String pass){
        passwordFiled.sendKeys(pass);
    }

    @FindBy(how = How.ID,using = "send2")
    WebElement signInButton;
    public  void clickSignInButton(){
        signInButton.click();
    }
}
