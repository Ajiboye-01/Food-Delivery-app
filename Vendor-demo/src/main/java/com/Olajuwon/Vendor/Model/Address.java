package com.Olajuwon.Vendor.Model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    
    private String street;
    private String city;
    private String state;
    private String postalCode;
    private String country;
}