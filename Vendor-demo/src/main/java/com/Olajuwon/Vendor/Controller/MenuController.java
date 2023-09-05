package com.Olajuwon.Vendor.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Olajuwon.Vendor.Model.Menu;
import com.Olajuwon.Vendor.Service.MenuService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/menus")
@RequiredArgsConstructor
public class MenuController {

    @Autowired
    private final MenuService mService;

    //Vendors will create menu for the users

    @PostMapping("/create_menu")
    public String createMenu(@RequestBody Menu menu){
        mService.createMenu(menu);
        return "Menu created successfully";
    }
    // Users will get all the menus created by the vendors

    @GetMapping("")
    public List<Menu> getAllMenu(){
        return mService.getAllMenu();
    }

    // Vendors will update their menu
    @PutMapping("/update_menu")
    public String updateMenu(@PathVariable Long id, @RequestBody Menu menu){
        mService.updateMenu(menu);
        return "Menu updated successfully";
    }

    @DeleteMapping("/delete")
    public String deleteMenu(@PathVariable Long id, @RequestBody Menu menu){
        mService.deleteMenu(menu);
        return "Menu delete";
    }



}
