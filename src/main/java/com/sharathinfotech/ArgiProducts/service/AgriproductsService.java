package com.sharathinfotech.ArgiProducts.service;

import com.sharathinfotech.ArgiProducts.model.Argiproducts;
import com.sharathinfotech.ArgiProducts.repository.Argiproductsrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgriproductsService {
    @Autowired
    private Argiproductsrepo repo;
    public Argiproducts addProduct(Argiproducts argiproducts) {
        return repo.save(argiproducts);
    }

    public List<Argiproducts> getAllProducts() {
        return repo.findAll();
    }
}
