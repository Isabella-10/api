package co.edu.umanizales.myfirstapi.controller;

import co.edu.umanizales.myfirstapi.model.Location;
import co.edu.umanizales.myfirstapi.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
*/

@Autowired
private LocationService locationService;


    @GetMapping
    public List<Location> getLocations() {

        return locationService.getLocations();
    }

    @GetMapping(path="/{code}")
    public Location getLocationByCode(@PathVariable String code){
        return locationService.getLocationByCode(code);

    }
    @GetMapping(path = "/name/{name}")
    public Location getLocationByName(@PathVariable String na<me) {
        return locationService.getLocationByName(name);

    }

    @GetMapping(path = "/states")
    public List<Location> getLocationByStates() {
        return locationService.getStates();
            }

    @GetMapping(path="/by_initial_letter/{letter}")
    public List<Location> getLocationByInitialLetter(@PathVariable Character letter) {
        return locationService.getLocationByInitialLetter(letter);
    }



