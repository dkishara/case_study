package WEB.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class myAccountPage {
    WebDriver driver = null;
    public myAccountPage(WebDriver driver){
        this.driver = driver;
    }
    @FindBy(how = How.XPATH,using = "//*[@id=\"maincontent\"]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/p")
    WebElement emailFiled;
    public String getEmailFiled(){
        String email;
        email = emailFiled.getText();
        return  email;
    }




}
