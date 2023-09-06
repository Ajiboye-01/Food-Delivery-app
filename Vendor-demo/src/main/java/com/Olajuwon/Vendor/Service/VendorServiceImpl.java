package com.Olajuwon.Vendor.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Olajuwon.Vendor.Model.Vendor;
import com.Olajuwon.Vendor.Repository.VendorRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class VendorServiceImpl implements VendorService {

    @Autowired
    private final VendorRepository vRepo;

    @Override
    public Vendor createVendor(Vendor vendor) {
        return vRepo.save(vendor);
    }

    @Override
    public List<Vendor> getAllVendors() {
        return vRepo.findAll();
    }

    @Override
    public Vendor updateVendorProfile(Vendor vendor) {
        return vRepo.save(vendor);
    }

    @Override
    public Vendor findByVendorName(String vendorName) {
        return vRepo.findByVendorName(vendorName);
    } 
}
