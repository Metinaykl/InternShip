package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

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


    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    public WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']/input")
    public WebElement codeInput;

    @FindBy(xpath = "//ms-save-button[@class='ng-star-inserted']/button")
    public WebElement saveBtn;

    @FindBy(xpath = "//div[@style='position: relative; height: 100%;']")
    public WebElement successfullyElement;

    @FindBy(css = "[data-placeholder='Name']")          // Genel search name inputu
    public WebElement searchName;

    @FindBy(xpath = "//*[text()='Search']")             // Genel search butonu
    public WebElement searchButton;

    @FindBy(xpath = "//*[text()='123grup12']")
    public WebElement myIBAN;

    @FindBy(xpath = "(//*[text()='124grup12']/following-sibling::td)[4]//ms-delete-button/button")
    public WebElement ibanDelete;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']/input")
    public WebElement shortName;

    @FindBy(xpath = "//input[@data-placeholder='Capacity']")
    public WebElement capacity;

    @FindBy(xpath = "//*[@class='mat-toolbar-row']")
    public WebElement boslukclick;

    @FindBy(xpath = "(//*[text()='Stage'])[3]")
    public WebElement stage;

    @FindBy(xpath = "//span[text()=' Certificate ']")
    public WebElement certificate;

    @FindBy(xpath = "//span[text()=' Dismissal ']")
    public WebElement dismissal;

    @FindBy(xpath = "//span[text()=' Employment ']")
    public WebElement employment;

    @FindBy(xpath = "//span[text()=' Contract ']")
    public WebElement contact;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='description']/input")
    public WebElement description;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']/input")
    public  WebElement priority;

    @FindBy(xpath = "//input[@data-placeholder='Description']")
    public WebElement descriptionInput;

    @FindBy(css = "[data-placeholder='IBAN']")
    public WebElement iban;

    @FindBy(xpath = "(//*[text()='Currency'])[3]")
    public WebElement currency;

    @FindBy(xpath = "(//*[@role='option'])[4]")
    public WebElement currencyTRY;

}