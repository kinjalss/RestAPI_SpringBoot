package com.example.product_backend.servicelayer;

import com.example.product_backend.entity.Product;
import com.example.product_backend.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//Spring already creates object for the below class wherever we write @Service
public class ProductService {

    @Autowired
    ProductRepo repo;
    //so whatever spring creates object,it stores that object's memory address into repo
    //inject object for class productrepo in this class as  product service it is depends on  productrepo

    public void addproducts(){
        Product p=new Product();
        p.setName("Laptop");
        p.setPrice(50000);
        Product p2=new Product();
        p2.setName("Phone");
        p2.setPrice(40000);

        repo.save(p);
        repo.save(p2);

    }

    public List<Product> getproducts() {
        return repo.findAll();


    }
}
//select * from products;
//class ProuctRe implements ProductRepo{
// }-- this is done internally by spring why? bcoz to access crud methods like save,findall
//we need to make object to access and that all methods are declared in ProductRepo as it extends JpaRepo
//but object of interface cannot be created so Spring internally creates class that implements ProductRepo



//@Autowired means:
//
//“Spring, please put the required object here automatically.”
//without spring we need to write dependent objects in another class
//if A class depends on B
//If car depends on engine we need to write object of engine in car
//this creates dependency in object classes leads to tight coupling
//spring automatically provides dependency injection that is it provides object automatically from outside and follows that one class will handle only one responsibility--SINGLE RESPONSOIBILITY PRINCIPLE
