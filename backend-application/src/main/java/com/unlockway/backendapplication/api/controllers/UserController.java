package com.unlockway.backendapplication.api.controllers;

import com.unlockway.backendapplication.api.dto.UserDTO;
import com.unlockway.backendapplication.api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/data")
    public List<UserDTO> findAll(){
        List<UserDTO> result = userService.findAll();

        return result;
    }
}
