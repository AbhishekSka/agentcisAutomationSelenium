package Utilities;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

class isLinkOK{
    public String isLinkWorking(URL url) throws IOException {

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
