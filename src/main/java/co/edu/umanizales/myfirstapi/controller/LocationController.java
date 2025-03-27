package co.edu.umanizales.myfirstapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path="/location")
@RestController
public class LocationController{
    @GetMapping
    public String getLocation(){
         return"Location";
    }
}

