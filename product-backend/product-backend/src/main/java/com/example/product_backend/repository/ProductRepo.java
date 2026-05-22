package com.example.product_backend.repository;


import com.example.product_backend.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Integer> {

}
//ProductRepo r;
//r.findAll();---Hibernate says i will perform all operations on this line i will internally do SELECT*FROM products;
//r.save();----hibernate internally acha user save -->database check-->insert into..this hibernate internally does
//update product set price

//class Prouctre implements ProductRepo{
// }-- this is done internally by spring why? bcoz to access crud methods like save,findall
//we need to make object to access and that all methods are declared in ProductRepo as it extends JpaRepo
//but object of interface cannot be created so Spring internally creates class that implements ProductRepo


