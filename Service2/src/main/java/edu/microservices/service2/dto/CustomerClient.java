package edu.microservices.service2.dto;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "customer-service")
public interface CustomerClient {
    @GetMapping("/customers")
    List listCustomers();
}
