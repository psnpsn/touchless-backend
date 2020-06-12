/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.touchlesscompliance.entity;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author psn
 */
@Document("compliance")
public class Compliance {
    
    @Id
    private String id;
    
    private String agentId;
    private String gatewayId;
    private String tapwaterId;
    private LocalDateTime timestamp;
    private List<Tapread> tapreadIds;
    private LocalDateTime beginDateTime;
    private LocalDateTime endDateTime;
    private String washtime;
    private String compliance;

    public Compliance() {
    }

    public Compliance(String id, String agentId, String gatewayId, String tapwaterId, LocalDateTime timestamp, List<Tapread> tapreadIds, LocalDateTime beginDateTime, LocalDateTime endDateTime, String washtime, String compliance) {
        this.id = id;
        this.agentId = agentId;
        this.gatewayId = gatewayId;
        this.tapwaterId = tapwaterId;
        this.timestamp = timestamp;
        this.tapreadIds = tapreadIds;
        this.beginDateTime = beginDateTime;
        this.endDateTime = endDateTime;
        this.washtime = washtime;
        this.compliance = compliance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public String getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    public String getTapwaterId() {
        return tapwaterId;
    }

    public void setTapwaterId(String tapwaterId) {
        this.tapwaterId = tapwaterId;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public List<Tapread> getTapreadIds() {
        return tapreadIds;
    }

    public void setTapreadIds(List<Tapread> tapreadIds) {
        this.tapreadIds = tapreadIds;
    }

    public LocalDateTime getBeginDateTime() {
        return beginDateTime;
    }

    public void setBeginDateTime(LocalDateTime beginDateTime) {
        this.beginDateTime = beginDateTime;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(LocalDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }

    public String getWashtime() {
        return washtime;
    }

    public void setWashtime(String washtime) {
        this.washtime = washtime;
    }

    public String getCompliance() {
        return compliance;
    }

    public void setCompliance(String compliance) {
        this.compliance = compliance;
    }
    
    
}
