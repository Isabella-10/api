package co.edu.umanizales.myfirstapi.service;

import co.edu.umanizales.myfirstapi.model.Location;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import jakarta.annotation.PostConstruct;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Service
@Getter

public class LocationService {


    private List<Location> locations;

    @Value(value = "${locations_filename}")
    private String locationsFilename;


    @PostConstruct
    public void readLocationsFromCSV() throws IOException, URISyntaxException {
        locations = new ArrayList<>();


        Path pathFile = Paths.get(ClassLoader.getSystemResource(locationsFilename).toURI());


        try (CSVReader csvReader = new CSVReader(new FileReader(pathFile.toString()))) {
            String[] line;
            csvReader.skip(1);
            // Leer todas las filas del CSV
            while ((line = csvReader.readNext()) != null) {

                locations.add(new Location(line[0], line[1], line[2], line[3]));

            }
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }
    }

    public Location getLocationByCode(String code) {
        for (Location Location : locations) {
            if (Location.getCode().equals(code)) {
                return Location;
            }
        }
        return null;
    }
}

public Location getLocationByName(String name) {
    for (Location location : locations) {
        if (location.getDescription().equals(name)) {
            return location;
        }
    }
    return null;
}


        public List<Location> getStates() {
        List<Location> states = new ArrayList<>();
        for (Location location : locations) {
            if(location.getState_Code().length() ==2){
                states.add(location);
            }
        }
        return states;
    }
public List<Location> getLocationsByInitial(String letter) {
    List<Location> states = new ArrayList<>();
    for (Location location : locations) {
        if (location.getDescription().toLowerCase().startsWith(letter.toLowerCase())) {
            states.add(location);
            }
        }
        return null;
    }
}




