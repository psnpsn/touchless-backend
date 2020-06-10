/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.touchlesstapread;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

/**
 *
 * @author psn
 */
public interface TapreadRepository extends ReactiveMongoRepository<Tapread, String> {
    
    Flux<Tapread> findAllByTapwaterId(String id);
    Flux<Tapread> findAllByGatewayId(String id);
    Flux<Tapread> findAllByWristbandId(String id);
    
}
