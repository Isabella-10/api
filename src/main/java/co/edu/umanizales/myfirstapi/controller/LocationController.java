package co.edu.umanizales.myfirstapi.controller;

import co.edu.umanizales.myfirstapi.model.Location;
import co.edu.umanizales.myfirstapi.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/location")
public class LocationController {


    @Autowired
    private LocationService LocationService;


    @GetMapping
    public List<Location> getLocations() {

        return LocationService.getLocations();
    }

    @GetMapping(path = "/{code}")
    public Location getLocationByCode(@PathVariable String code) {
        return LocationService.getLocationByCode(code);

    }

    @GetMapping(path = "/name/{name}")
    public Location getLocationsByName(@PathVariable String name) {
        return LocationService.getLocationByName(name);

    }

    @GetMapping(path = "/states")
    public List<Location> getLocationByStates() {
        return LocationService.getStates();
    }

    @GetMapping(path = "/initialLetters/{initial}")
    public List<Location> getLocationByInitial(@PathVariable String initial) {
        return LocationService.getLocationsByInitialLetter(initial);

    }

    @GetMapping("/statecode/{stateCode}")
    public List<Location> getLocationByStateCode(@PathVariable String stateCode) {
        return LocationService.getLocationByStateCode(stateCode);

    }

    @GetMapping("/capitals")
    public List<Location> getCapitals() {
        return LocationService.getCapitals();
    }

    @GetMapping(path = "/state/{code}")
    public Location getStateByCode(@PathVariable String code) {
        return LocationService.getStateByCode(code);

    }
}

