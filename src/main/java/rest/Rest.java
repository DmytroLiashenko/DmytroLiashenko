package rest;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import javax.swing.text.html.parser.Entity;
import java.io.IOException;


public class Rest {
    public static String getRest(String url) {
        CloseableHttpClient httpClient= HttpClientBuilder.create().build();
        String ent=null;
        HttpResponse response;
        try {
            response=httpClient.execute(new HttpGet(url));
            ent= EntityUtils.toString(response.getEntity());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ent;
    }
}
