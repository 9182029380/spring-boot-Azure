package com.sharathinfotech.ArgiProducts.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "argiproducts")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Argiproducts {
    @Id
    @GeneratedValue
    public long id;  //pk
    public String name;
    public String description;
    public String category;
    public double price;
    public String imageurl;

}
