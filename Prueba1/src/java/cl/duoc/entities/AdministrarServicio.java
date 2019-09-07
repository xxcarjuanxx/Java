/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juan Colonia
 */
public class AdministrarServicio {
    
    private List<Servicio> servicios;

    public AdministrarServicio() {
        servicios = new ArrayList<>();
    }
    
    public void agregar(Servicio servicio) throws Exception{
        for(Servicio s : this.servicios){
            if(s.getIdServicio()== servicio.getIdServicio()){
                throw new Exception("Solicitud " + servicio.getIdServicio()+ " ya existe");
            }
        }
        this.servicios.add(servicio);
    }
    
  
    public boolean eliminar(int id) throws Exception{
        boolean existe = false;
        Servicio aux = null;
        for(Servicio s : this.servicios){
            if(s.getIdServicio()== id){
                aux = s;
                existe = true;
                break;
            }
        }
        if(existe){
            this.servicios.remove(aux);
            return existe;
        }else{
            throw  new Exception("Solicitud " + id + " no existe");
        }        
    }
    
    public List<Servicio> getAll(){
        return servicios;
    }
    
    
    
    
}
