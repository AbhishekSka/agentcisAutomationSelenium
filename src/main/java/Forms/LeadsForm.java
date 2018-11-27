package main.java.Forms;


import Dirvers.DriverSet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;


/**
 * Hello world!
 */

public class LeadsForm extends DriverSet {

    //clickForm
    By enquiryModule = By.xpath("//a[contains(@href,\"https://democis.agentcisapp.com/lead-forms\")]");
    //By webForm = By.xpath("a[@class='ag-top-toolbar__menu__item__link']"); //*li[@class="ag-top-toolbar__menu__item"]
    By enquiryForm = By.xpath("/online-form/blahblehblew");

    By enquiryName = By.name("first_name");
    By enquiryLastname = By.name("last_name");
    // By enquiryDOB = By.id("");


    //contact
    By enquiryAccordion = By.className("");
    By enquiryPhone = By.name("phone");
    By enquiryEmail = By.name("email");
    By enquirySecondaryMail = By.name("secondary_email");
    By enquiryContactpreference = By.name("contact_preference");

    //Address
    By enquiryStreet = By.name("street");
    By enquiryCity = By.name("city");
    By enquiryState = By.name("state");
    By enquiryZip = By.name("zip_code");
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


    public LeadsForm(WebDriver webDriver) {
        this.wDriver = webDriver;

    }


    //web form click
    public void EnterEnquiry() {

        wDriver.findElement(enquiryModule).click();

        wDriver.findElement(enquiryForm);

      /*Reporter.log("here");
        WebElement webForm = wDriver.findElement(enquiryModule);
        Reporter.log(String.valueOf(webForm));
        List<WebElement> Form = webForm.findElements(webForm1);
        System.out.println("form");
     // WebElement webFormLogo=webForm;
        Form.get(0).click();
        Thread.sleep(3000);


        String FormLink = String.valueOf(wDriver.getWindowHandles());
        System.out.println("This is first window: "+FormLink);
        for(String secondFormLink:wDriver.getWindowHandles()){
            wDriver.switchTo().window(secondFormLink);
        }*/
    }


    public void FillEnquiry() throws IOException {

        //Initializing properties
        Properties globalProperties = new Properties();
        FileInputStream individualProperties = new FileInputStream(
                "/media/introcept-nepal/New Volume/Abhishek/AutomateHP/agentcisAutomationSelenium/src/configure.properties");
        globalProperties.load(individualProperties);


        //Name
        wDriver.findElement(enquiryName)
                .sendKeys(globalProperties.getProperty("firstName"));
        wDriver.findElement(enquiryLastname)
                .sendKeys(globalProperties.getProperty("LastName"));
        //WebElement LDOB = wDriver.findElement(LeadDOB);

        //Contacts
        wDriver.findElement(enquiryPhone)
                .sendKeys(globalProperties.getProperty("phoneNo"));
        wDriver.findElement(enquiryEmail)
                .sendKeys(globalProperties.getProperty("mailId"));
        wDriver.findElement(enquirySecondaryMail)
                .sendKeys(globalProperties.getProperty("secondaryMailId"));

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
                .sendKeys(globalProperties.getProperty("streetName"));
        wDriver.findElement(enquiryCity)
                .sendKeys(globalProperties.getProperty("cityName"));
        wDriver.findElement(enquiryState)
                .sendKeys(globalProperties.getProperty("stateName"));
        wDriver.findElement(enquiryZip)
                .sendKeys(globalProperties.getProperty("zip"));


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


    }
}
