package Utilities;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class isLinkWorking {

    public String isLinkOK(URL url) throws IOException {

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        try{
            connection.connect();
            String response = connection.getResponseMessage();
           // String Code = connection.getHeaderField(response);
            connection.disconnect();
            return response;

        } catch (IOException e) {
            return e.getMessage();
        }
    }
}
