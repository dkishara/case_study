package WEB.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class productPage {
    WebDriver driver =null;
    public productPage(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(how = How.ID,using = "product-addtocart-button")
    WebElement addToCartButton;
    public void clickAddToCartButton(){
        addToCartButton.click();
    }

    @FindBy(how = How.XPATH,using = "//*[@id=\"option-label-size-150-item-5596\"]")
    WebElement sizeMedium;
    public void clickSizeMedium(){
        sizeMedium.click();
    }

    @FindBy(how = How.ID,using = "option-label-color-93-item-5477")
    WebElement colorBlue;
    public void clickColourBlue(){
        colorBlue.click();
    }

}
