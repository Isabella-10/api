package co.edu.umanizales.myfirstapi.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



@Getter
@Setter
public class Product extends Parameter {
    private double price;
    private int stock;
    private TypeProduct type;

    public Product(String code, String name, double price, int stock, TypeProduct type) {
        super(code, name);
        this.price = price;
        this.stock = stock;
        this.type = type;
    }
}

