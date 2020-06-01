/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.touchlessgateway;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 *
 * @author psn
 */
public interface GatewayRepository extends ReactiveMongoRepository<Gateway, String> {
    
}
