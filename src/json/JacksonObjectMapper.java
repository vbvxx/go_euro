package json;

import model.CityInfo;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by vincentbeauvieux on 24/09/2016.
 */
public class JacksonObjectMapper {

    public static ArrayList<CityInfo> readJSON(String dataJson) throws JacksonParseException, JsonEmptyException {
        ObjectMapper objectMapper = new ObjectMapper();
        ArrayList<CityInfo> cityInfo;
        try {
            cityInfo = objectMapper.readValue(dataJson, new TypeReference<ArrayList<CityInfo>>(){});
            if(cityInfo.isEmpty()) {
                throw new JsonEmptyException("Json is empty");
            }

        } catch (IOException e) {
            throw new JacksonParseException("Failure while parsing JSON");
        }
        return cityInfo;
    }
}
