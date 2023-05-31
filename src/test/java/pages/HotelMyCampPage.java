package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelMyCampPage {
    public HotelMyCampPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath="(//a[@class='nav-link'])[7]")
    public WebElement loginLink;

    @FindBy(xpath = "//input[@class='form-control required']")
    public WebElement userName;

    @FindBy(xpath = "//input[@class='form-control required password']")
    public WebElement passWord;

    @FindBy(id = "btnSubmit")
    public WebElement loginButton;

    @FindBy(id="menuHotels")
    public WebElement hotelManagement;

    @FindBy(xpath = "(//i[@class='icon-calendar'])[2]")
    public WebElement hotelList;

    @FindBy(xpath = "//span[@class='hidden-480']")
    public WebElement addHotel;

    @FindBy(xpath = "//input[@name='Code']")
    public WebElement codeBox;

    @FindBy(xpath = "//button[@id='btnSubmit']")
    public WebElement saveButton;

    @FindBy(xpath = "//select[@class='form-control input-lg required']")
    public WebElement ddm;






}
