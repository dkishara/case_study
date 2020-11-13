package WEB.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class homePage {
    WebDriver driver=null;
    //constructor
    public homePage(WebDriver driver){
        this.driver = driver;
    }
    //create account link
    @FindBy(how = How.XPATH,using = "/html/body/div[1]/header/div[1]/div/ul/li[3]/a")
    WebElement createAccountLink;
    public void ClickCreateAccount(){
        createAccountLink.click();
    }

    @FindBy(how = How.XPATH,using = "/html/body/div[1]/header/div[1]/div/ul/li[2]/a")
    WebElement signInLink;
    public void clickSignIn(){
        signInLink.click();
    }

    @FindBy(how = How.XPATH,using = "//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[2]/div/a/span/span/img")
    WebElement secondItem;
    public void clickSecondItem(){
        secondItem.click();
    }

    @FindBy(how = How.XPATH,using = "/html/body/div[1]/header/div[2]/div[1]/a/span[2]/span[1]")
    WebElement cartItemCount;
    public String getCartItemCount(){
        return cartItemCount.getText();
    }

}
