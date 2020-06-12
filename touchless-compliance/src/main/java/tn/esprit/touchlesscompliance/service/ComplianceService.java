/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.touchlesscompliance.service;

import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import tn.esprit.touchlesscompliance.entity.Compliance;
import tn.esprit.touchlesscompliance.repository.ComplianceRepository;

/**
 *
 * @author psn
 */
@Service
public class ComplianceService {
    
    @Autowired
    private ComplianceRepository repository;
    
    
    public Flux<Compliance> getAll() {
        return repository.findAll().switchIfEmpty(Flux.empty());
    }
    
    
    public Mono<Compliance> getById(final String id){
        return repository.findById(id);
    }
    
    public Mono save(final Compliance compliance) {
	Mono<Compliance> createdCompliance = repository.save(compliance);
        return createdCompliance;
    }
    
    public Mono update(final Compliance compliance) {
        return repository.save(compliance);
    }
    
    public Mono delete(final String id) {
        final Mono<Compliance> complianceToDelete = getById(id);
        if (Objects.isNull(complianceToDelete)) {
            return Mono.empty();
	}
	return complianceToDelete.switchIfEmpty(Mono.empty()).filter(Objects::nonNull).flatMap(complianceToBeDeleted -> repository
            .delete(complianceToBeDeleted).then(Mono.just(complianceToBeDeleted)));
    }
    
}
