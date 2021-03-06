package com.ynding.cloud.auth.authentication.controller;


import com.ynding.cloud.auth.authentication.data.MenuRepository;
import com.ynding.cloud.auth.authentication.data.UserRepository;
import com.ynding.cloud.auth.authentication.entity.Menu;
import com.ynding.cloud.auth.authentication.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 这是一个只要登录就能访问的Controller
 * 主要用来获取一些配置信息
 * @author ynding
 *
 */
@RestController
@RequestMapping("/config")
public class ConfigController {
    @Autowired
    MenuService menuService;
    @Autowired
    UserRepository userRepository;
    @Autowired
    MenuRepository menuRepository;


    @GetMapping("/sysMenu")
    public List<Menu> sysMenu() {

        return menuRepository.findAll();
    }

    @GetMapping("/user")
    public Object currentUser() {
        return SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
