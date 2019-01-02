package Forms;


import Dirvers.DriverSet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;


/**
 * Hello world!
 */

public class LeadsForm extends DriverSet {

    //clickForm
    By enquiryModule = By.xpath("//a[contains(@href,\"https://360test.agentcisapp.com/lead-forms\")]");

    //By webForm = By.xpath("a[@class='ag-top-toolbar__menu__item__link']"); //*li[@class="ag-top-toolbar__menu__item"]
    By enquiryForm = By.xpath("//tr[2]/td[2]/a[contains(@href,\"/online-form/all\")]");

    By enquiryName = By.id("first_name");
    By enquiryLastname = By.id("last_name");
    // By enquiryDOB = By.id("");


    //contact
    //By enquiryAccordion = By.className("");
    By enquiryPhone = By.name("phone");
    By enquiryEmail = By.name("email");
    By enquirySecondaryMail = By.name("secondary_email");
    By enquiryContactpreference = By.name("contact_preference");

    //Address
    By enquiryStreet = By.name("street");
    By enquiryCity = By.id("city");
    By enquiryState = By.name("state");
    By enquiryZip = By.id("postal_code");
    By enquiryCountry = By.name("country");

    //Current visa info
    By enquiryVisatype = By.name("visa_type");
    By enquiryVisaexpirydate = By.name("visa_expiry_date");
    By enquiryPassport = By.name("country_of_passport");


    //Intrested services
    //By enquiryServicesCheck = By.name("");

    //Other test score
    //By enquiry = By.id();

    //Office Details
    //By enquiryOfficeChoice = By.id("");

    //Comments
    // By enquiryComments = By.id("comment");

    //Submit blue button
    By submit = By.xpath("//button[@class=\"button blue-button\"]");


    public LeadsForm(WebDriver webDriver) {
        this.wDriver = webDriver;

    }


    //web form click
    public void EnterEnquiry() throws InterruptedException {

        wDriver.findElement(enquiryModule).click();

        Thread.sleep(3000);

        //Get the current window handle
        String windowHandle = wDriver.getWindowHandle();

        wDriver.findElement(enquiryForm).click();
        Thread.sleep(3000);

        //Use the list of window handles to switch between windows
        for (String newTab : wDriver.getWindowHandles()) {
            if (!newTab.equals(windowHandle)) {

                wDriver.switchTo().window(newTab);
            }
        }

        Thread.sleep(3000);


    }


    public void FillEnquiry() throws IOException, InterruptedException {

        //Initializing properties
        Properties globalProperties = new Properties();
        File propfile = new File("resources/config.properties");
        FileInputStream individualProperties = new FileInputStream(propfile);
        globalProperties.load(individualProperties);

        //Name
        wDriver.findElement(enquiryName)
                .sendKeys(globalProperties.getProperty("first_name"));
        wDriver.findElement(enquiryLastname)
                .sendKeys(globalProperties.getProperty("last_name"));
        //WebElement LDOB = wDriver.findElement(LeadDOB);

        //Contacts
        wDriver.findElement(enquiryPhone)
                .sendKeys(globalProperties.getProperty("phoneNo"));
        wDriver.findElement(enquiryEmail)
                .sendKeys(globalProperties.getProperty("mail"));
        wDriver.findElement(enquirySecondaryMail)
                .sendKeys(globalProperties.getProperty("secondary_email"));

        //Radio
        List<WebElement> leadpref = wDriver.findElements(enquiryContactpreference);
        boolean choose = leadpref.get(0).isSelected();
        if (choose) {
            leadpref.get(1).click();
        } else {
            leadpref.get(0).click();
        }

        //Address
        wDriver.findElement(enquiryStreet)
                .sendKeys(globalProperties.getProperty("street_name"));
        wDriver.findElement(enquiryCity)
                .sendKeys(globalProperties.getProperty("city_name"));
        wDriver.findElement(enquiryState)
                .sendKeys(globalProperties.getProperty("state_name"));
        wDriver.findElement(enquiryZip)
                .sendKeys(globalProperties.getProperty("zip_code"));


        //Country Dropdown
    /*    Select LCountryDropdown = new Select(wDriver.findElement(LeadCountry));
        LCountryDropdown.selectByIndex(128);
        //Passport
        Select LPassportDropdown = new Select(wDriver.findElement(LeadPassport));
        LPassportDropdown.selectByIndex(124);*/

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
            //Submit
        wDriver.findElement(submit).click();
        Thread.sleep(3000);
    }
}
