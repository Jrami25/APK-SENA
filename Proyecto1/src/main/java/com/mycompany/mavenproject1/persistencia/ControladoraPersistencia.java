
package com.mycompany.mavenproject1.persistencia;

import com.mycompany.mavenproject1.logica.Car;
import com.mycompany.mavenproject1.logica.Owner;
import java.util.List;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
    OwnerJpaController ownerJpa = new OwnerJpaController();
    CarJpaController carJpa = new CarJpaController();
    
    public void guardar(Owner duenio, Car owcar){
        
        ownerJpa.create(duenio);
        carJpa.create(owcar);
        
    }
    public List<Carros> dataCar(){
        return CarJpa.findCarEntities();
    }
    public void borrarCar(CC_Owner){
        try{
            
        CarJpa.destroy(CC_Owner);
        }

    }
    catch(NonexistentEntityException ex){
    Logger.getLogger(ControladoraPersistencia.class.getName()).log(level.SEVERE,null, ex);
    
}
    public Car cargarDatos(int CC_Owner){
        return CarJpa.findCar(CC_Owner);
    }
}
