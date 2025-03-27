package co.edu.umanizales.myfirstapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Getter
@Setter
@AllArgsConstructor


public class Location {
    private String code;
    private String description;
}
