package com.Olajuwon.Vendor.Model;

// import java.util.ArrayList;

// import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
// import jakarta.persistence.FetchType;
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
public class Vendor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long vendorId;

    private String vendorName;
    private String email;
    private int phoneNo;
    private double balance;
    private String password;

    @Embedded
    private Address address;
    private int rating;

//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//     @JoinColumn(name = "menu_id", referencedColumnName = "menuId")
//     private ArrayList<Menu> menus;
}
