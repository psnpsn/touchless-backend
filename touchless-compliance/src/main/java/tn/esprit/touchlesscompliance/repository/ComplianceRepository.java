/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.touchlesscompliance.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import tn.esprit.touchlesscompliance.entity.Compliance;

/**
 *
 * @author psn
 */
public interface ComplianceRepository extends ReactiveMongoRepository<Compliance, String>{
    
    
}
