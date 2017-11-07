package Forms;

import Dirvers.DriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Hello world!
 *
 */

public class LeadsForm extends DriverSetup
{
    //name
    By LeadName = By.name("first_name");
    By LeadLastname = By.name("last_name");
   // By LeadDOB = By.id("");

    //contact
    By LeadPhone= By.id("phone");
    By Leademail=By.id("email");
    By LeadSecondaryMail=By.id("secondary_email");

    By Leadcontactpreference=By.xpath("//div/input[@name='first_point_of_contact']");

    //Address
    By LeadStreet=By.id("street");
    By LeadCity=By.id("city");
    By LeadState = By.id("state");
    By LeadZip = By.id("zip_code    ");
    By LeadCountry = By.xpath("//div/select[@id='country']");
    By LeadPassport = By.xpath("//div/select[@id='country_of_passport']");

    //Intrested services
    By LeadServicesCheck = By.className("ui doubling stackable three column grid paddingBlock padded dashed-line");

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
        //    WebElement LDOB = wDriver.findElement(LeadDOB);f

        //Contacts
        wDriver.findElement(LeadPhone).sendKeys();
        wDriver.findElement(Leademail).sendKeys();
        wDriver.findElement(LeadSecondaryMail).sendKeys();
        //Radio
        List<WebElement> leadpref=wDriver.findElements(Leadcontactpreference);
        boolean choose=leadpref.get(0).isSelected();
        if (choose){
            leadpref.get(1).click();
        }else{
            leadpref.get(0).click();
        }



        //Address
        wDriver.findElement(LeadStreet).sendKeys();
        wDriver.findElement(LeadCity).sendKeys();
        wDriver.findElement(LeadState).sendKeys();
        wDriver.findElement(LeadZip).sendKeys();
        //Country Dropdown
        Select LCountryDropdown = new Select(wDriver.findElement(LeadCountry));
        LCountryDropdown.selectByIndex(128);
        //Passport
        Select LPassportDropdown = new Select(wDriver.findElement(LeadPassport));
        LPassportDropdown.selectByIndex(124);

           /* //Interested Services
            wDriver.findElement(LeadServicesCheck).sendKeys();

            //Other details
            wDriver.findElement(LeadperfIntake).sendKeys();
            wDriver.findElement(LeadVisaExpiryDate).sendKeys();
            wDriver.findElement(LeadVisaType).sendKeys();

            //Office Details
            wDriver.findElement(LeadsOfficeChoice).sendKeys();

            //Comments
            wDriver.findElement(LeadsComments).sendKeys();
*/








    }
}
