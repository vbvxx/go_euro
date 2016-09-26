import Parser.CommandParser;
import Parser.BadArgumentsException;
import http.BadContentTypeException;
import http.Connector;
import http.MalformatedURIException;
import json.JacksonObjectMapper;
import json.JacksonParseException;
import json.JsonEmptyException;
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
        String jsonResponse;
        try {
            String city = CommandParser.Parse(args);
            jsonResponse = Connector.GetJSON(city);
            ArrayList<CityInfo> cityInfos;
            cityInfos = JacksonObjectMapper.readJSON(jsonResponse);
            CSVWriter.writeCSV(cityInfos);
            System.exit(1);
        } catch (BadContentTypeException | JacksonParseException | CSVWriterException | MalformatedURIException | JsonEmptyException | IOException | BadArgumentsException exception ) {
            exception.printStackTrace();
            System.exit(0);
        }
    }
}
