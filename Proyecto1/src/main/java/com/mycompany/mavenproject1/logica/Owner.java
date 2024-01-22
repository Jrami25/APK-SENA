
package com.mycompany.mavenproject1.logica;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Owner implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idOwner;
    private String cc_owner;
    private String ownersname;

    public Owner() {
    }

    public Owner(int idOwner, String cc_owner, String ownersname) {
        this.idOwner = idOwner;
        this.cc_owner = cc_owner;
        this.ownersname = ownersname;
    }

    public int getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(int idOwner) {
        this.idOwner = idOwner;
    }

    public String getCc_owner() {
        return cc_owner;
    }

    public void setCc_owner(String cc_owner) {
        this.cc_owner = cc_owner;
    }

    public String getOwnersname() {
        return ownersname;
    }

    public void setOwnersname(String ownersname) {
        this.ownersname = ownersname;
    }

    
    
    
    
    
        
}

    

    

    
