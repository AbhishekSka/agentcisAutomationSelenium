package Forms;

import Dirvers.DriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Hello world!
 *
 */
public class LeadsForm extends DriverSetup
{
    //name
    By LeadName = By.name("first_name");
    By LeadLastname = By.name("last_name");
    By LeadDOB = By.id("");

    //contact
    By LeadPhone= By.id("phone");
    By Leademail=By.id("email");
    By LeadSecondaryMail=By.id("secondary_email");
    By Leadcontactpreference=By.id("");

    //Address
    By LeadStreet=By.id("street");
    By LeadCity=By.id("city");
    By LeadState = By.id("state");
    By LeadZip = By.id("zip_code    ");
    By LeadCountry = By.id("visa_type");
    By LeadPassport = By.id("");

    //Intrested services
    By LeadServicesCheck = By.id("");

    //Other details
    By LeadperfIntake = By.id("");
    By LeadVisaExpiryDate = By.id("");
    By LeadVisaType = By.id("");

    //Office Details
    By LeadsOfficeChoice = By.id("");

    //Comments
    By LeadsComments = By.id("comment");

    WebDriver wDriver;

    public  LeadsForm(WebDriver wDriver)
    {
        this.wDriver = wDriver;
    }

    public void FillLeads(){
        //Name
        WebElement LName = wDriver.findElement(LeadName);
        LName.sendKeys("");
        WebElement LlastName = wDriver.findElement(LeadLastname);
        LName.sendKeys("");

    }
}
