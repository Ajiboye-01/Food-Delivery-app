package com.Olajuwon.Vendor.Model;

import java.util.ArrayList;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Vendor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String brandName;
    private String email;
    private int phoneNo;
    private Address address;
    private ArrayList<String> menus;
}
