package http;

import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;


import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by vincentbeauvieux on 24/09/2016.
 */
public class Connector {

    private static String URL_SOURCE = "http://api.goeuro.com/api/v2/position/suggest/en/";

    public static String GetJSON(String city) throws IOException, BadContentTypeException, MalformatedURIException {
        String cityInfosJSON = "";
        String urlCityInfo = URL_SOURCE + city;

        CloseableHttpClient httpclient = HttpClients.createDefault();
        URI uri;
        try {
            urlCityInfo = urlCityInfo.replace(" ","%20");
            URIBuilder uriBuilder = new URIBuilder(urlCityInfo);
            uri = uriBuilder.build();
        } catch (URISyntaxException e) {
            throw new MalformatedURIException("Uncorrect url");
        }
        HttpGet httpGet = new HttpGet(uri);
        CloseableHttpResponse response = httpclient.execute(httpGet);
        try {
            HttpEntity entity = response.getEntity();
            String contentType = entity.getContentType().getValue();
            String mimeType = contentType.split(";")[0].trim();
            if ("application/json".equals(mimeType)) {
                cityInfosJSON = EntityUtils.toString(entity);
            } else {
                throw new BadContentTypeException("Content/type is not JSON");
            }
            EntityUtils.consume(entity);
        } finally {
            response.close();
        }
        return cityInfosJSON;
    }
}
