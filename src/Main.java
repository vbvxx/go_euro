import http.BadContentTypeException;
import http.Connector;
import http.MalformatedURIException;
import json.JacksonObjectMapper;
import json.JacksonParseException;
import model.CityInfo;
import writer.CSVWriter;
import writer.CSVWriterException;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by vincentbeauvieux on 24/09/2016.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        //String city = args[0];
        String city = "Los Angeles";
        String jsonResponse = null;
        try {
            jsonResponse = Connector.GetJSON(city);
            ArrayList<CityInfo> cityInfos = null;
            cityInfos = JacksonObjectMapper.readJSON(jsonResponse);
            CSVWriter.writeCSV(cityInfos);
            System.exit(1);
        } catch (BadContentTypeException badContentTypeException) {
            badContentTypeException.printStackTrace();
            System.exit(0);
        } catch (JacksonParseException jacksonParseException) {
            jacksonParseException.printStackTrace();
            System.exit(0);
        } catch (CSVWriterException csvWriterException) {
            csvWriterException.printStackTrace();
            System.exit(0);
        } catch (MalformatedURIException malformatedURIException) {
            malformatedURIException.printStackTrace();
            System.exit(0);
        }
    }
}
