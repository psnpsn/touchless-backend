/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.touchlesstapread;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 *
 * @author psn
 */
@RestController
@RequestMapping("tapread")
public class TapreadController {
    
    @Autowired
    private TapreadService service;
    
    @GetMapping
    public Flux<Tapread> getAll() {
        return service.getAll();
    }
    
    @GetMapping("{id}")
    public Mono getById(@PathVariable("id") final String id) {
	return service.getById(id);
    }
    @PutMapping("{id}")
    public Mono updateById(@RequestBody final Tapread tapread) {
	return service.update(tapread);
    }
    @PostMapping
    public Mono save(@RequestBody final Tapread tapread) {
	return service.save(tapread);
    }
    @DeleteMapping("{id}")
    public Mono delete(@PathVariable final String id) {
	return service.delete(id);
    }
    
}
