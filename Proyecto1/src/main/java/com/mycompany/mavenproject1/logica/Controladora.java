
package com.mycompany.mavenproject1.logica;

import com.mycompany.mavenproject1.persistencia.ControladoraPersistencia;


public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String mark, String ced, String date, String descrip, String model, String registr, String ownersname, String type) {
        
        Owner duenio = new Owner();
        duenio.setOwnersname(ownersname);
        duenio.setCc_owner(ced);
        
        Car owcar = new Car();
        owcar.setBrand(mark);
        owcar.setModel(model);
        owcar.setRegistrationf(registr);
        owcar.setType(type);
        owcar.setDescription(descrip);
        
        controlPersis.guardar( duenio, owcar);
    }
    public List<Carros> dataCar(){
        
        return controlPersis.dataCar();
}
        public void borrarCar(int CC_Owner){
            controlPersis.borrarCar(num_car);
        }
        public Car cargarDatos(int CC_Owner){
        return controlPersis.cargarDatos(CC_Owner);
    }
}
