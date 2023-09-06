package com.Olajuwon.Vendor.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Olajuwon.Vendor.Model.Vendor;
import com.Olajuwon.Vendor.Service.VendorService;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/vendors")
@RequiredArgsConstructor
public class VendorController {
    
    @Autowired
    private final VendorService vService;

    @PostMapping("/create")
    public Vendor createVendor(@RequestBody Vendor vendor){
        return vService.createVendor(vendor);
    }

    @GetMapping("")
    public List<Vendor> getAllVendors(){
        return vService.getAllVendors();
    }

    @PutMapping("/update_profile")
    public Vendor updateVendorProfile(@PathVariable Long id, @RequestBody Vendor vendor){
        return vService.updateVendorProfile(vendor);
    }

    @GetMapping("/{vendorName}")
    public Vendor getVendor(@PathVariable String vendorName){
        return vService.findByVendorName(vendorName);
    }
}
