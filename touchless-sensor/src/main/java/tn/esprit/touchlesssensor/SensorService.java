/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.touchlesssensor;

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
public class SensorService {
    
    @Autowired
    private SensorRepository repository;
    
    public Flux<Sensor> getAll() {
        return repository.findAll().switchIfEmpty(Flux.empty());
    }
    
    public Mono<Sensor> getById(final String id){
        return repository.findById(id);
    }
    
    public Mono save(final Sensor sensor) {
	return repository.save(sensor);
    }
    
    public Mono update(final Sensor sensor) {
        return repository.save(sensor);
    }
    
    public Mono delete(final String id) {
        final Mono<Sensor> sensorToDelete = getById(id);
        if (Objects.isNull(sensorToDelete)) {
            return Mono.empty();
	}
	return sensorToDelete.switchIfEmpty(Mono.empty()).filter(Objects::nonNull).flatMap(sensorToBeDeleted -> repository
            .delete(sensorToBeDeleted).then(Mono.just(sensorToBeDeleted)));
    }
    
}
