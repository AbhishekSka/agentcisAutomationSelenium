package main.Utilities;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class IsLinkWorking {

    public static String isLinkOK(URL url) throws IOException {

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            try{

                connection.connect();
                String response = connection.getResponseMessage();
                System.out.println(response);
                connection.disconnect();
                return response;

            } catch (IOException e)
            {
             return e.getMessage();
            }
    }
}
