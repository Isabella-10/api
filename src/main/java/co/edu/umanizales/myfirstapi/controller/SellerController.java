package co.edu.umanizales.myfirstapi.controller;

import co.edu.umanizales.myfirstapi.model.Seller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/seller")
public class SellerController {

    @GetMapping
    public String getSeller(){
    Seller alejandra = new Seller("345356","alejandra","osorio","Cali",(byte)23,'f');
    Seller alfonso = new Seller("547377","alfonso","buritica","Pereira",(byte)20,'m');
    Seller gloria =new Seller("312670","gloria","ramirez","Manizales",(byte)19,'f');
    Seller luis =new Seller("274539","luis","quintero","ibague",(byte)37,'m');
    Seller antonia=new Seller("175730","antonia","giraldo","Medellin",(byte)40, 'f');
    return "seller";
    }
}
