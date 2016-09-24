package writer;

import model.CityInfo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * Created by vincentbeauvieux on 24/09/2016.
 */
public class CSVWriter {

    private static final String COMMA_DELIMITER = ";";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FILE_HEADER = "_id;name;type;latitude;longitude";
    private static final String FILE_NAME = "./cityInfos.csv";

    public static void writeCSV(ArrayList<CityInfo> cityInfos) throws CSVWriterException {
        FileWriter fileWriter = null;
        try {

            Path p = Paths.get("./cityInfos.csv");
            boolean notExists = Files.notExists(p);
            System.out.println(notExists);
            fileWriter = new FileWriter(FILE_NAME,true);
            if(notExists){
                fileWriter.append(FILE_HEADER.toString());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
            for(CityInfo cityInfo : cityInfos){
                fileWriter.append(String.valueOf(cityInfo.get_id()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(cityInfo.getName()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(cityInfo.getType()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(cityInfo.getGeo_position().getLatitude()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(cityInfo.getGeo_position().getLongitude()));
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
        } catch (IOException e) {
            throw new CSVWriterException("problem while writing to csv file");
        }finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
