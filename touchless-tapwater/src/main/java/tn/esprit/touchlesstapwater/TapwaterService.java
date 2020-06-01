/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.touchlesstapwater;

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
public class TapwaterService {
    
    @Autowired
    private TapwaterRepository repository;
    
    public Flux<Tapwater> getAll() {
        return repository.findAll().switchIfEmpty(Flux.empty());
    }
    
    public Mono<Tapwater> getById(final String id){
        return repository.findById(id);
    }
    
    public Mono save(final Tapwater tapwater) {
	return repository.save(tapwater);
    }
    
    public Mono update(final Tapwater tapwater) {
        return repository.save(tapwater);
    }
    
    public Mono delete(final String id) {
        final Mono<Tapwater> tapwaterToDelete = getById(id);
        if (Objects.isNull(tapwaterToDelete)) {
            return Mono.empty();
	}
	return tapwaterToDelete.switchIfEmpty(Mono.empty()).filter(Objects::nonNull).flatMap(tapwaterToBeDeleted -> repository
            .delete(tapwaterToBeDeleted).then(Mono.just(tapwaterToBeDeleted)));
    }
    
}
