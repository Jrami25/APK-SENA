
package com.mycompany.mavenproject1.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Car implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int num_owner;
    private String type;
    private String brand;
    private String model;
    private String registrationf;
    private String Description;
    @OneToOne
    private Owner unOwner;

    public Car() {
    }

    public Car(int num_owner, String type, String brand, String model, String registrationf, String Description, Owner unOwner) {
        this.num_owner = num_owner;
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.registrationf = registrationf;
        this.Description = Description;
        this.unOwner = unOwner;
    }

    
    public int getNum_owner() {
        return num_owner;
    }

    public void setNum_owner(int num_owner) {
        this.num_owner = num_owner;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegistrationf() {
        return registrationf;
    }

    public void setRegistrationf(String registrationf) {
        this.registrationf = registrationf;
    }

    public Owner getUnOwner() {
        return unOwner;
    }

    public void setUnOwner(Owner unOwner) {
        this.unOwner = unOwner;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    

    
}
