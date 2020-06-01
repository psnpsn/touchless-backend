/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.touchlesswristband;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 *
 * @author psn
 */
public interface WristbandRepository extends ReactiveMongoRepository<Wristband, String> {
    
}
