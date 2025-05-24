package co.edu.umanizales.myfirstapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Seller {
private String identification;
private TypeDocument typedoc;
private String name;
private String LastName;
private Location city;
private byte age;
private char gender;
}

