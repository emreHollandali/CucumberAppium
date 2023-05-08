package pages.android;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class ApiDemosPage {
    public ApiDemosPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)),this);
    }

//    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Accessibility']")
//    public WebElement accessibility;
//    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Animation']")
//    public WebElement animations;
//    @AndroidFindBy(xpath = "//android.widget.TextView[@text='App']")
//    public WebElement app;
//    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Content']")
//    public WebElement content;
//    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Graphics']")
//    public WebElement graphics;
//    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Hardware']")
//    public WebElement hardware;
//    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Media']")
//    public WebElement media;
//    @AndroidFindBy(xpath = "//android.widget.TextView[@text='NFC']")
//    public WebElement nfc;
//    @AndroidFindBy(xpath = "//android.widget.TextView[@text='OS']")
//    public WebElement os;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Preference']")
    public WebElement preference;
//    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Security']")
//    public WebElement security;
//    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Text']")
//    public WebElement text;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Views']")
    public WebElement views;


}
