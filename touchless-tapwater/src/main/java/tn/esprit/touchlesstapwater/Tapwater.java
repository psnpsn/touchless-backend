/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.touchlesstapwater;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author psn
 */

@Document(collection = "tapwater")
public class Tapwater {
    
    @Id
    private String id;
    
    private String ipA;
    private String gatewayId;
    private String status;
    private String boardModel;
    private String tapModel;
    private String currentVersion;
    private String installDate;

    public Tapwater() {
    }

    public Tapwater(String id, String ipA, String gatewayId, String status, String boardModel, String tapModel, String currentVersion, String installDate) {
        this.id = id;
        this.ipA = ipA;
        this.gatewayId = gatewayId;
        this.status = status;
        this.boardModel = boardModel;
        this.tapModel = tapModel;
        this.currentVersion = currentVersion;
        this.installDate = installDate;
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
    
    

    public String getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
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

    public String getTapModel() {
        return tapModel;
    }

    public void setTapModel(String tapModel) {
        this.tapModel = tapModel;
    }

    public String getCurrentVersion() {
        return currentVersion;
    }

    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    public String getInstallDate() {
        return installDate;
    }

    public void setInstallDate(String installDate) {
        this.installDate = installDate;
    }
    
}
