package co.edu.umanizales.myfirstapi.service;

import co.edu.umanizales.myfirstapi.model.Location;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.springframework.stereotype.Service;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class LocationService {

    public List<Location> readLocationsFromCSV(String csvFilePath) throws IOException {
        List<Location> locations = new ArrayList<>();

        try (CSVReader csvReader = new CSVReader(new FileReader(csvFilePath))) {
            String[] line;

            while ((line = csvReader.readNext()) != null) {

                String codigoDepartamento = line[0];
                String nombreDepartamento = line[1];
                String codigoMunicipio = line[2];
                String nombreMunicipio = line[3];
                String tipoMunicipio = line[4];
                String longitud = line[5];
                String latitud = line[6];

                Location location = new Location(codigoDepartamento, nombreDepartamento, codigoMunicipio, nombreMunicipio, tipoMunicipio, longitud, latitud);

                locations.add(location);
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }
        return locations;
    }

}
