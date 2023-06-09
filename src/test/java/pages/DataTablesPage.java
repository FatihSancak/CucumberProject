package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DataTablesPage{
    public DataTablesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//span[contains(text(),'New')]")
    public WebElement newButton;
    @FindBy(xpath ="//input[@id='DTE_Field_first_name']")
    public WebElement firstName;
    @FindBy(xpath ="//input[@id='DTE_Field_last_name']")
    public WebElement lastName;
    @FindBy(xpath ="//input[@id='DTE_Field_position']")
    public WebElement position;
    @FindBy(xpath ="//input[@id='DTE_Field_office']")
    public WebElement office;
    @FindBy(xpath ="//input[@id='DTE_Field_extn']")
    public WebElement extension;
    @FindBy(xpath ="//input[@id='DTE_Field_start_date']")
    public WebElement startDate;
    @FindBy(xpath ="//input[@id='DTE_Field_salary']")
    public WebElement salary;
    @FindBy(xpath ="//button[contains(text(),'Create')]")
    public WebElement createButton;
    @FindBy(xpath ="//input[@type='search']")
    public WebElement searchButton;
    @FindBy(xpath ="//td[@class='sorting_1']")
    public WebElement aramaSonucIlkElement;
}