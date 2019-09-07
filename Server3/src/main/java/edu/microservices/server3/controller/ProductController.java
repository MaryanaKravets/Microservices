package edu.microservices.server3.controller;

import edu.microservices.server3.model.Product;
import edu.microservices.server3.service.IProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@AllArgsConstructor
public class ProductController {

    IProductService iProductService;


    @ResponseBody
    @GetMapping
    public List<Product> findAllProducts() {

        return iProductService.findAll();
    }

    @ResponseBody
    @GetMapping("/{id}")
    public Product findById(@PathVariable("id") Long id) {

        return iProductService.findById(id);
    }

    @ResponseBody
    @PostMapping
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        iProductService.add(product);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .build();
    }

    @ResponseBody
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Long id) {
        iProductService.delete(id);
    }

    @ResponseBody
    @PatchMapping
    public Product updateAccount(@RequestBody Product product) {
        return iProductService.update(product);
    }
}
