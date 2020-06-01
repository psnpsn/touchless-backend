/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.touchlesssite;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author psn
 */

@Document(collection = "site")
public class Site {
    
    @Id
    private String id;
    
    private String name;
    private String address;
    private String email;
    private String telephone;
    private String telephone2;
    private String ownerFullName;
    private String contractDate;
    private String installationDate;
    private String workingDate;
    private String status;
    
}
