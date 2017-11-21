package Forms;

import Dirvers.DriverSetup;
import Utilities.isLinkWorking;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class OverallUrlCheckUp extends DriverSetup {

    //Login Page
   URL username = new URL("https://democis.staging.agentcis.com/auth/login");


    // Side nav
    By sideNav = By.xpath("//ul[@class='ag-side-nav__menu ag-scroll']/li");

    //Dashboard
   /* By Dashboard=




    //Client
    By Leads=
    By Prospects=
    By Clients


    //Partner
    By Partner=


    //Product
    By Product=

    //Workflow
    By Workflow=

    //Quotations
    By Quotation=
    By QuotationTemplate=
    By ActiveQuotations=
    By ArchivedQuotation=

    //Invoice
    By Accounts=
    By Invoices=
    By Payments=
    By Receivables=

    //Teams
    By Teams=
    By Offices=
    By Users=
    By Referrer=

    //Task
    By Task=
    By AssigneToMe=
    By AllTasks=
    By CompletedTasks=


*/


    //Report

 public OverallUrlCheckUp(WebDriver webDriver) throws MalformedURLException {
        this.wDriver = webDriver;
    }

    public void linkCheck() throws IOException {

        //LOGIN
        isLinkWorking.isLinkOK(username);
        Assert.assertTrue(true,"Link is ok");

        //DASHBOARD
        List<WebElement> links = wDriver.findElements(sideNav);
        if(links.size()<14){
            for(int i=0;i<links.size();i++) {
                WebElement singleLinks = links.get(i);
                URL url=new URL(singleLinks.getAttribute("href"));
                isLinkWorking.isLinkOK(url);
                Reporter.log("Dashboard link Ok");
                //findElement(By.xpath("//a"))
            }

        }

    }
}
