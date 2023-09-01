package com.Olajuwon.Vendor.Service;

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
    public void createMenu() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createMenu'");
    }
    
}
