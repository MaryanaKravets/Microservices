package edu.microservices.service2.controller;

import edu.microservices.service2.dto.CustomerClient;
import edu.microservices.service2.dto.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    CustomerClient customerClient;
    @Autowired
    ProductClient productClient;

    @ResponseBody
    @GetMapping("/products")
    public List listOfProducts() {
       return productClient.listProducts();
    }

    @GetMapping("/customers")
    public List listOfCustomers(){
        return customerClient.listCustomers();
    }
}
