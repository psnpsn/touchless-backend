/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.touchlesstapread;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author psn
 */
@Document
public class Tapread {
    
    @Id
    private String id;
    private String sensorId;
    private String tapwaterId;
    private String gatewayId;
    private String wristbandId;
    private String value;
    @JsonFormat(pattern="dd-MM-yyyy HH:mm:ss")
    private LocalDate timestamp;

    public Tapread() {
    }

    public Tapread(String id, String sensorId, String tapwaterId, String gatewayId, String wristbandId, String value, LocalDate timestamp) {
        this.id = id;
        this.sensorId = sensorId;
        this.tapwaterId = tapwaterId;
        this.gatewayId = gatewayId;
        this.wristbandId = wristbandId;
        this.value = value;
        this.timestamp = timestamp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSensorId() {
        return sensorId;
    }

    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }

    public String getTapwaterId() {
        return tapwaterId;
    }

    public void setTapwaterId(String tapwaterId) {
        this.tapwaterId = tapwaterId;
    }

    public String getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    public String getWristbandId() {
        return wristbandId;
    }

    public void setWristbandId(String wristbandId) {
        this.wristbandId = wristbandId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
    }
    
    
    
    
}
