package co.edu.umanizales.myfirstapi.controller;

import co.edu.umanizales.myfirstapi.model.Location;
import co.edu.umanizales.myfirstapi.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping(path="/location")
public class LocationController{
/*
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Location getLocation(){
        Location location = new Location("1","Manizales");

         return location;
    }



    }
*/

@Autowired
private LocationService locationService;

    @GetMapping
    public List<Location> getLocations() {
        try {
            String csvFilePath = "/Users/analu/IdeaProjects/myfirstapi/src/main/java/co/edu/umanizales/myfirstapi/service/locations.csv";
            return locationService.readLocationsFromCSV(csvFilePath);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


}




    3