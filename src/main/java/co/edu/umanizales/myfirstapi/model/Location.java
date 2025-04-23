package co.edu.umanizales.myfirstapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor


public class Location {
    private String code;
    private String description;
    private String state_Code;
    private String name_State;

}
