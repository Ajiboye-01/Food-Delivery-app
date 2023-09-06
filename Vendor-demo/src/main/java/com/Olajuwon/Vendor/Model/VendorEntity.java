package com.Olajuwon.Vendor.Model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VendorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long vendorId;

    private String vendorName;
    private String email;
    private int phoneNo;
    private String password;

    @Embedded
    private Address address;
    private int rating;
}
