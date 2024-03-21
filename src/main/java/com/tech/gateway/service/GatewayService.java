package com.tech.gateway.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.tech.gateway.entity.Employee;


@RestController
public class GatewayService  {

 private RestTemplate restTemplate;

 @Autowired
 public GatewayService(RestTemplate restTemplate) {
     this.restTemplate = restTemplate;
 }

 
 @GetMapping("/gateway/employees/{id}")
 public ResponseEntity<Employee> getEmployee(@PathVariable Long id) {
     ResponseEntity<Employee> response = restTemplate.exchange(
             "http://localhost:8081/api/employees/" + id,
             HttpMethod.GET,
             null,
             Employee.class);
     return ResponseEntity.status(response.getStatusCode()).body(response.getBody());
 }
}

