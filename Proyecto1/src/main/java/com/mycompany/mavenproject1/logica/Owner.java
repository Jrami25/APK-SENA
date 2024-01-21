
package com.mycompany.mavenproject1.logica;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Owner {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int IDowner;
    private String cc_owner;
    private String ownersname;

    public Owner() {
    }

    public Owner(int IDowner, String cc_owner, String ownersname) {
        this.IDowner = IDowner;
        this.cc_owner = cc_owner;
        this.ownersname = ownersname;
    }

    public int getIDowner() {
        return IDowner;
    }

    public void setIDowner(int IDowner) {
        this.IDowner = IDowner;
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

    

    

    
