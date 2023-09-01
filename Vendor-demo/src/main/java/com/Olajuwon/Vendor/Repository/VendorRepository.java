package com.Olajuwon.Vendor.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Olajuwon.Vendor.Model.Vendor;


public interface VendorRepository extends JpaRepository<Vendor, Long>{ 
}
