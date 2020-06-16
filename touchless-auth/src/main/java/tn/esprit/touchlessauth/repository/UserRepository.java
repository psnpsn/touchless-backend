/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.touchlessauth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.touchlessauth.domain.User;

/**
 *
 * @author psn
 */
public interface UserRepository extends JpaRepository<User, Integer>{;
        
    User findByUsername(String username);
        
}
