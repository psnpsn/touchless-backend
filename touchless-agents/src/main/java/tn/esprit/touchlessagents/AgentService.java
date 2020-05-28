/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.touchlessagents;

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
public class AgentService {
    
    @Autowired
    private AgentRepository repository;
    
    public Flux<Agent> getAll() {
        return repository.findAll().switchIfEmpty(Flux.empty());
    }
    
    public Mono<Agent> getById(final String id){
        return repository.findById(id);
    }
    
    public Mono save(final Agent agent) {
	return repository.save(agent);
    }
    
    public Mono update(final Agent agent) {
        return repository.save(agent);
    }
    
    public Mono delete(final String id) {
        final Mono<Agent> agentToDelete = getById(id);
        if (Objects.isNull(agentToDelete)) {
            return Mono.empty();
	}
	return agentToDelete.switchIfEmpty(Mono.empty()).filter(Objects::nonNull).flatMap(agentToBeDeleted -> repository
            .delete(agentToBeDeleted).then(Mono.just(agentToBeDeleted)));
    }
    
}
