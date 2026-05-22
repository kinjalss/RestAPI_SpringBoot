package com.example.product_backend.controller;

import com.example.product_backend.entity.Product;
import com.example.product_backend.servicelayer.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//means-Controller handles all RestAPIs
public class Controller {

    @Autowired
    ProductService ps;
//    inject object of ProductService class Controller class

    @GetMapping("/products")
    public List<Product> getproducts() {
        return ps.getproducts();
    }
        //jabh user /products dalega tabh yea run kr aur kya bhej ki ps yane to access methods we need object of a class to access any method
        //here we accessed ProductService wala method ka getproducts jo hame saare products dega
        //hibernate internally select*from products and yea dega apneko structure and then it converts into proper format using application.properties

        @GetMapping("/add")
        public String addproducts(){
            ps.addproducts();
            return "Products Added";
        }


}



//Controller-handles request and sends request for processing, for logic to service layer
//service layer depends on Repository or sends to repository for database operations
//and this repository does database operations on class Entity-
//in which all variables are declared i.e name,price,id