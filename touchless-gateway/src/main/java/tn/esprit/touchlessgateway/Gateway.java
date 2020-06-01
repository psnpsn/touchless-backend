/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.touchlessgateway;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author psn
 */
@Document(collection = "gateway")
public class Gateway {
    
    @Id
    private String id;
    
    private String ipA;
    private String siteId;
    private String coordinates;
    private String currentVersion;
    private String status;
    private String boardModel;

    public Gateway() {
    }

    public Gateway(String id, String ipA, String siteId, String coordinates, String currentVersion, String status, String boardModel) {
        this.id = id;
        this.ipA = ipA;
        this.siteId = siteId;
        this.coordinates = coordinates;
        this.currentVersion = currentVersion;
        this.status = status;
        this.boardModel = boardModel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIpA() {
        return ipA;
    }

    public void setIpA(String ipA) {
        this.ipA = ipA;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public String getCurrentVersion() {
        return currentVersion;
    }

    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBoardModel() {
        return boardModel;
    }

    public void setBoardModel(String boardModel) {
        this.boardModel = boardModel;
    }
    
    
}
