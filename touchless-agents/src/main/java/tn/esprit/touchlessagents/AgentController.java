/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.touchlessagents;

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
@RequestMapping("agent")
public class AgentController {
    
    @Autowired
    private AgentService service;
    
    @GetMapping
    public Flux<Agent> getAll() {
        return service.getAll();
    }
    
    @GetMapping("{id}")
    public Mono getById(@PathVariable("id") final String id) {
	return service.getById(id);
    }
    @PutMapping("{id}")
    public Mono updateById(@RequestBody final Agent agent) {
	return service.update(agent);
    }
    @PostMapping
    public Mono save(@RequestBody final Agent agent) {
        System.out.println("Agent: " + agent.toString());
	return service.save(agent);
    }
    @DeleteMapping("{id}")
    public Mono delete(@PathVariable final String id) {
	return service.delete(id);
    }
}
