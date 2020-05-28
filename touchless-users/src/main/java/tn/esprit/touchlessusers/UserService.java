/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.touchlessusers;

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
public class UserService {
    
    @Autowired
    private UserRepository repository;
    
    public Flux<User> getAll() {
        return repository.findAll().switchIfEmpty(Flux.empty());
    }
    
    public Mono<User> getById(final String id){
        return repository.findById(id);
    }
    
    public Mono save(final User user) {
	return repository.save(user);
    }
    
    public Mono update(final User user) {
        return repository.save(user);
    }
    
    public Mono delete(final String id) {
        final Mono<User> userToDelete = getById(id);
        if (Objects.isNull(userToDelete)) {
            return Mono.empty();
	}
	return userToDelete.switchIfEmpty(Mono.empty()).filter(Objects::nonNull).flatMap(userToBeDeleted -> repository
            .delete(userToBeDeleted).then(Mono.just(userToBeDeleted)));
    }
    
}
