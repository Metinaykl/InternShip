package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "input[formcontrolname='username']")
    public WebElement username;

    @FindBy(css = "input[formcontrolname='password']")
    public WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(css = "span[class='mat-tooltip-trigger logo-text']")
    public WebElement txtTechnoStudy;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addImgButton;

    @FindBy(xpath = "//button[@class='mat-focus-indicator mat-tooltip-trigger mat-icon-button mat-button-base mat-accent ng-star-inserted'][1]")
    public WebElement editImgButton;

    @FindBy(xpath = "//button[@class='mat-focus-indicator mat-tooltip-trigger mat-icon-button mat-button-base mat-warn ng-star-inserted'][1]")
    public WebElement deleteImgButton;

    @FindBy(xpath = "//*[@class='svg-inline--fa fa-square-xmark']")
    public WebElement closeButton;

    @FindBy(xpath = "//button[@class='mat-focus-indicator mat-button mat-raised-button mat-button-base mat-accent']")
    public WebElement deleteButton;




}

