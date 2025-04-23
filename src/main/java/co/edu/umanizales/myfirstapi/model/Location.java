package co.edu.umanizales.myfirstapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor


public class Location {
    private String codigoDepartamento;
    private String nombreDepartamento;
    private String codigoMunicipio;
    private String nombreMunicipio;
    private String tipoMunicipio;
    private String longitud;
    private String latitud;
}
