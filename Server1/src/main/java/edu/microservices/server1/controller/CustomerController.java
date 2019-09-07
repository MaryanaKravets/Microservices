package edu.microservices.server1.controller;

import edu.microservices.server1.model.Customer;
import edu.microservices.server1.service.ICustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
@AllArgsConstructor
public class CustomerController {

    ICustomerService iCustomerService;


    @ResponseBody
    @GetMapping
    public List<Customer> findAllCustomer() {

        return iCustomerService.findAll();
    }

    @ResponseBody
    @GetMapping("/{id}")
    public Customer findById(@PathVariable("id") Long id) {

        return iCustomerService.findById(id);
    }

    @ResponseBody
    @PostMapping
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
        iCustomerService.add(customer);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .build();
    }

    @ResponseBody
    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable("id") Long id) {
        iCustomerService.delete(id);
    }

    @ResponseBody
    @PatchMapping
    public Customer updateCustomer(@RequestBody Customer customer) {
        return iCustomerService.update(customer);
    }
}
