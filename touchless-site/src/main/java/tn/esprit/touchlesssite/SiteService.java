/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.touchlesssite;

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
public class SiteService {
    
    @Autowired
    private SiteRepository repository;
    
    public Flux<Site> getAll() {
        return repository.findAll().switchIfEmpty(Flux.empty());
    }
    
    public Mono<Site> getById(final String id){
        return repository.findById(id);
    }
    
    public Mono save(final Site site) {
	return repository.save(site);
    }
    
    public Mono update(final Site site) {
        return repository.save(site);
    }
    
    public Mono delete(final String id) {
        final Mono<Site> siteToDelete = getById(id);
        if (Objects.isNull(siteToDelete)) {
            return Mono.empty();
	}
	return siteToDelete.switchIfEmpty(Mono.empty()).filter(Objects::nonNull).flatMap(siteToBeDeleted -> repository
            .delete(siteToBeDeleted).then(Mono.just(siteToBeDeleted)));
    }
    
}
