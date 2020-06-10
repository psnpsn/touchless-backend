/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.touchlesstapread.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import tn.esprit.touchlesstapread.Tapread;

/**
 *
 * @author psn
 */
public class Sender {
    
    private static final Logger LOGGER =
        LoggerFactory.getLogger(Sender.class);
    
    @Autowired
    private KafkaTemplate<String, Tapread> kafkaTemplate;
    
    public void send(String topic, Tapread payload) {
        LOGGER.info("sending payload='{}'", payload);
        kafkaTemplate.send(topic, payload);
    }
    
}
