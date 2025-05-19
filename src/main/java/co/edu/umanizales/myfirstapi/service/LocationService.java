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

public class locationService {


    private List<Location> locations;

    @Value(value = "${locations_filename}")
    private String locationsFilename;


    @PostConstruct
    public void readLocationsFromCSV() throws IOException, URISyntaxException {
        locations = new ArrayList<>();
        locations.add(new Location("05","ANTIOQUIA"));
        locations.add(new Location("17","CALDAS"));
        locations.add(new Location("66","RISARALDA"));
        locations.add(new Location("91","AMAZONAS"));
        locations.add(new Location("08","ATLANTICO"));
        locations.add(new Location("11","BOGOTA"));
        locations.add(new Location("13","BOLIVAR"));

        Path pathFile = Paths.get(ClassLoader.getSystemResource(locationsFilename).toURI());


        try (CSVReader csvReader = new CSVReader(new FileReader(pathFile.toString()))) {
            String[] line;
            csvReader.skip(1);
            // Leer todas las filas del CSV
            while ((line = csvReader.readNext()) != null) {

                locations.add(new Location(line[2], line[3]));

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
            if(location.getCode().length() ==2){
                states.add(location);
            }
        }
        return states;
    }
public List<Location> getLocationsByInitial(String letter) {
    List<Location> result = new ArrayList<>();
    for (Location location : locations) {
        if (location.getDescription().toLowerCase().startsWith(letter.toLowerCase())) {
            result.add(location);
            }
        }
        return null;
    }





