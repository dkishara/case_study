package WEB.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class createAccountPage {
    WebDriver driver=null;
    //constructer
    public createAccountPage(WebDriver driver){
        this.driver = driver;
    }
    @FindBy(how = How.ID,using = "firstname")
    WebElement firstName;
    public void fillFirstName(String fname){
        firstName.sendKeys(fname);
    }

    @FindBy(how = How.ID,using = "lastname")
    WebElement lastName;
    public void fillLastName(String lname){
        lastName.sendKeys(lname);
    }

    @FindBy(how = How.ID,using = "is_subscribed")
    WebElement newsLetterSubscribe;
    public void clickNewsLetterSubscribe(){
        newsLetterSubscribe.click();
    }

    @FindBy(how = How.ID,using = "email_address")
    WebElement emailAddress;
    public void fillEmail(String email){
        emailAddress.sendKeys(email);
    }

    @FindBy(how = How.ID,using = "password")
    WebElement passwordFiled;
    public void fillPassword(String pass){
        passwordFiled.sendKeys(pass);
    }

    @FindBy(how = How.ID,using = "password-confirmation")
    WebElement confirmPasswordFiled;
    public void fillConfirmPassword(String pass){
        confirmPasswordFiled.sendKeys(pass);
    }

    @FindBy(how = How.XPATH,using = "//*[@id=\"form-validate\"]/div/div[1]/button")
    WebElement createAccountButton;
    public void clickCreateAccountButton(){
        createAccountButton.click();
    }


}
