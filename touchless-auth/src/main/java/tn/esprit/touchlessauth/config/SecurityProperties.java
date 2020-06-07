/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.touchlessauth.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.io.Resource;

/**
 *
 * @author psn
 */
@ConfigurationProperties("security")
public class SecurityProperties {
 
    private JwtProperties jwt;
 
    public JwtProperties getJwt() {
        return jwt;
    }
 
    public void setJwt(JwtProperties jwt) {
        this.jwt = jwt;
    }
 
    public static class JwtProperties {
 
        private Resource keyStore;
        private String keyStorePassword;
        private String keyPairAlias;
        private String keyPairPassword;
 
        public Resource getKeyStore() {
            return keyStore;
        }
 
        public void setKeyStore(Resource keyStore) {
            this.keyStore = keyStore;
        }
 
        public String getKeyStorePassword() {
            return keyStorePassword;
        }
 
        public void setKeyStorePassword(String keyStorePassword) {
            this.keyStorePassword = keyStorePassword;
        }
 
        public String getKeyPairAlias() {
            return keyPairAlias;
        }
 
        public void setKeyPairAlias(String keyPairAlias) {
            this.keyPairAlias = keyPairAlias;
        }
 
        public String getKeyPairPassword() {
            return keyPairPassword;
        }
 
        public void setKeyPairPassword(String keyPairPassword) {
            this.keyPairPassword = keyPairPassword;
        }
    }
}
