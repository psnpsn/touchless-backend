/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.touchlesssensor;

import org.springframework.boot.Banner;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author psn
 */
@Document(collection = "sensor")
public class Sensor {
    
    @Id
    private String id;
    
    private String measuredParam;
    private String model;
    private String tapwaterId;

    public Sensor() {
    }

    public Sensor(String id, String measuredParam, String model, String tapwaterId) {
        this.id = id;
        this.measuredParam = measuredParam;
        this.model = model;
        this.tapwaterId = tapwaterId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMeasuredParam() {
        return measuredParam;
    }

    public void setMeasuredParam(String measuredParam) {
        this.measuredParam = measuredParam;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTapwaterId() {
        return tapwaterId;
    }

    public void setTapwaterId(String tapwaterId) {
        this.tapwaterId = tapwaterId;
    }
    
    
    
 
    
}
