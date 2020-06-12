/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.touchlesstapread;

import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import tn.esprit.touchlesstapread.config.Sender;

/**
 *
 * @author psn
 */
@Service
public class TapreadService {
    
    @Autowired
    private TapreadRepository repository;
    
    @Value("${spring.kafka.topic.tapReadPersisted}")
    private static String TAPREAD_PERSISTED_TOPIC;
    
    @Autowired
    private Sender sender;
    
    public Flux<Tapread> getAll() {
        return repository.findAll().switchIfEmpty(Flux.empty());
    }
    
    
    public Mono<Tapread> getById(final String id){
        return repository.findById(id);
    }
    
    public Mono save(final Tapread tapread) {
        System.out.println(tapread.toString());
        
	Mono<Tapread> createdTapread = repository.save(tapread);
        createdTapread.subscribe(
            value -> {
                System.out.println("inside subscribe");
                System.out.println(value.toString());
                sender.send("tapReadPersisted", value);
            }
        );
        
        return createdTapread;
    }
    
    public Mono update(final Tapread tapread) {
        return repository.save(tapread);
    }
    
    public Mono delete(final String id) {
        final Mono<Tapread> tapreadToDelete = getById(id);
        if (Objects.isNull(tapreadToDelete)) {
            return Mono.empty();
	}
	return tapreadToDelete.switchIfEmpty(Mono.empty()).filter(Objects::nonNull).flatMap(tapreadToBeDeleted -> repository
            .delete(tapreadToBeDeleted).then(Mono.just(tapreadToBeDeleted)));
    }
    
}
