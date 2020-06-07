/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.touchlessauth.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.touchlessauth.domain.User;

/**
 *
 * @author psn
 */
@Repository
public interface UserDetailsRepository extends JpaRepository<User, Integer> {
    
    Optional<User> findByUsername(String username);
    
}
