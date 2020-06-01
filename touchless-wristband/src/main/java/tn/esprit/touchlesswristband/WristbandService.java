/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.touchlesswristband;

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
public class WristbandService {
    
    @Autowired
    private WristbandRepository repository;
    
    public Flux<Wristband> getAll() {
        return repository.findAll().switchIfEmpty(Flux.empty());
    }
    
    public Mono<Wristband> getById(final String id){
        return repository.findById(id);
    }
    
    public Mono save(final Wristband wristband) {
	return repository.save(wristband);
    }
    
    public Mono update(final Wristband wristband) {
        return repository.save(wristband);
    }
    
    public Mono delete(final String id) {
        final Mono<Wristband> wristbandToDelete = getById(id);
        if (Objects.isNull(wristbandToDelete)) {
            return Mono.empty();
	}
	return wristbandToDelete.switchIfEmpty(Mono.empty()).filter(Objects::nonNull).flatMap(wristbandToBeDeleted -> repository
            .delete(wristbandToBeDeleted).then(Mono.just(wristbandToBeDeleted)));
    }
    
}
