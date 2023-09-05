package com.Olajuwon.Vendor.Service;

import java.util.List;

import com.Olajuwon.Vendor.Model.Menu;

public interface MenuService {
    Menu createMenu(Menu menu);
    List<Menu> getAllMenu();
    Menu updateMenu(Menu menu);
    Menu deleteMenu(Menu menu);
}
