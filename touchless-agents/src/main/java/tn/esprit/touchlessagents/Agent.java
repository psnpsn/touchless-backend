/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.touchlessagents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author psn
 */
@Document(collection = "agent")
public class Agent {
    @Id
    private String id;
    private String status;
    private String lastname;
    private String firstname;
    private String telephone;
    private String email;
    private String wristbandId;
    private String siteId;

    public Agent() {
    }

    public Agent(String id, String status, String lastname, String firstname, String telephone, String email, String wristbandId, String siteId) {
        this.id = id;
        this.status = status;
        this.lastname = lastname;
        this.firstname = firstname;
        this.telephone = telephone;
        this.email = email;
        this.wristbandId = wristbandId;
        this.siteId = siteId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWristbandId() {
        return wristbandId;
    }

    public void setWristbandId(String wristbandId) {
        this.wristbandId = wristbandId;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }
    
    
    
    
}
