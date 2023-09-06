package com.Olajuwon.Vendor.Service;

import java.util.List;

import com.Olajuwon.Vendor.Model.Vendor;

public interface VendorService {
    
    Vendor createVendor(Vendor vendor);

    List<Vendor> getAllVendors();

    Vendor updateVendorProfile(Vendor vendor);

    Vendor findByVendorName(String vendorName);
    
}
