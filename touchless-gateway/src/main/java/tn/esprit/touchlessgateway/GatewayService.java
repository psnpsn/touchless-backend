/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.touchlessgateway;

import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 *
 * @author psn
 */
@Service
public class GatewayService {
    
    @Autowired
    private GatewayRepository repository;
    
    public Flux<Gateway> getAll() {
        return repository.findAll().switchIfEmpty(Flux.empty());
    }
    
    public Mono<Gateway> getById(final String id){
        return repository.findById(id);
    }
    
    public Mono save(final Gateway gateway) {
	return repository.save(gateway);
    }
    
    public Mono update(final Gateway gateway) {
        return repository.save(gateway);
    }
    
    public Mono delete(final String id) {
        final Mono<Gateway> gatewayToDelete = getById(id);
        if (Objects.isNull(gatewayToDelete)) {
            return Mono.empty();
	}
	return gatewayToDelete.switchIfEmpty(Mono.empty()).filter(Objects::nonNull).flatMap(gatewayToBeDeleted -> repository
            .delete(gatewayToBeDeleted).then(Mono.just(gatewayToBeDeleted)));
    }
    
}
