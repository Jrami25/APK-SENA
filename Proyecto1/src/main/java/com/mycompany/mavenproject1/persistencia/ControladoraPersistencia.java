
package com.mycompany.mavenproject1.persistencia;

import com.mycompany.mavenproject1.logica.Car;
import com.mycompany.mavenproject1.logica.Owner;


public class ControladoraPersistencia {
    
    OwnerJpaController ownerJpa = new OwnerJpaController();
    CarJpaController carJpa = new CarJpaController();
    
    public void guardar(Owner duenio, Car owcar){
        
        ownerJpa.create(duenio);
        carJpa.create(owcar);
        
    }
}
