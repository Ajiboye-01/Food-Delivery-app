package com.Olajuwon.Vendor.Service;

import java.util.List;

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

    @Override
    public List<Menu> getAllMenu() {
        return mRepo.findAll();
    }

    @Override
    public Menu updateMenu(Menu menu) {
        return mRepo.save(menu);
    }

    @Override
    public void deleteMenu(Menu menu) {
        mRepo.delete(menu);
    }

    @Override
    public Menu getMenuByName(String itemName) {
        return mRepo.findByItemName(itemName);
    }

    
}
