/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.touchlessauth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.touchlessauth.domain.User;
import tn.esprit.touchlessauth.service.UserDetailsServiceImpl;

/**
 *
 * @author psn
 */
@RestController

public class UserController {
    
    @Autowired
    private UserDetailsServiceImpl service;
    
    @GetMapping("/user/{username}")
    public User getUser(@PathVariable String username) {
        return service.getUserbyUsername(username);
    }
    
}
