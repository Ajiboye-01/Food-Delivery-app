package com.Olajuwon.Vendor.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Olajuwon.Vendor.Model.Menu;
import com.Olajuwon.Vendor.Repository.MenuRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService {

    @Autowired
    private final MenuRepository mRepo;
    
    @Override
    public Menu createMenu (Menu menu) {
        return mRepo.save(menu);
    }
}
