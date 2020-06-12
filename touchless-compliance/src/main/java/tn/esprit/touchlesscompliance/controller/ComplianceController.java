/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.touchlesscompliance.controller;

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
import tn.esprit.touchlesscompliance.entity.Compliance;
import tn.esprit.touchlesscompliance.service.ComplianceService;

/**
 *
 * @author psn
 */
@RestController
@RequestMapping("compliance")
public class ComplianceController {
     
    @Autowired
    private ComplianceService service;
    
    @GetMapping
    public Flux<Compliance> getAll() {
        return service.getAll();
    }
    
    @GetMapping("{id}")
    public Mono getById(@PathVariable("id") final String id) {
	return service.getById(id);
    }
    @PutMapping("{id}")
    public Mono updateById(@RequestBody final Compliance compliance) {
	return service.update(compliance);
    }
    @PostMapping
    public Mono save(@RequestBody final Compliance compliance) {
	return service.save(compliance);
    }
    @DeleteMapping("{id}")
    public Mono delete(@PathVariable final String id) {
	return service.delete(id);
    }
}
