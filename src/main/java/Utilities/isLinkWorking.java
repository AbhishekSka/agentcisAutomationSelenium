package Utilities;

import org.testng.Assert;
import org.testng.Reporter;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class isLinkWorking {

    public static String isLinkOK(URL url) throws IOException {

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        try{
            connection.connect();
            String response = connection.getResponseMessage();
            Reporter.log(response,true);
            String Code = connection.getHeaderField(response);
            Reporter.log(Code);
            connection.disconnect();
            return response;

        } catch (IOException e) {
            return e.getMessage();
        }
    }
}
