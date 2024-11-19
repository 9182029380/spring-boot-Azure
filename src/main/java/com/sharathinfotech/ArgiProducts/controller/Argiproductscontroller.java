package com.sharathinfotech.ArgiProducts.controller;

import com.sharathinfotech.ArgiProducts.model.Argiproducts;
import com.sharathinfotech.ArgiProducts.service.AgriproductsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/argiproducts")
public class Argiproductscontroller {
    @Autowired
    private AgriproductsService service;

    @PostMapping("/add")
    public Argiproducts addProduct(@RequestBody Argiproducts argiproducts){
        return service.addProduct(argiproducts);
    }
    @GetMapping()
    public List<Argiproducts> getAllProducts(){
        return service.getAllProducts();
    }


}
