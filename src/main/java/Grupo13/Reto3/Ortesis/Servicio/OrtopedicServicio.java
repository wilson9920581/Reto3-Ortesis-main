/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grupo13.Reto3.Ortesis.Servicio;

import Grupo13.Reto3.Ortesis.Modelo.Ortopedic;
import Grupo13.Reto3.Ortesis.Repositorio.OrtopedicRepositorio;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrtopedicServicio {
       @Autowired
    private OrtopedicRepositorio ortopedicRepositorio;

    public List<Ortopedic> getAll(){
        return ortopedicRepositorio.getAll();
    }

    public Optional<Ortopedic> getOrtopedic(int ortopedicId) {
        return ortopedicRepositorio.getOrtopedic(ortopedicId);
    }

    public Ortopedic save(Ortopedic ortopedic){
        if(ortopedic.getId()==null){
            return ortopedicRepositorio.save(ortopedic);
        }else{
            Optional<Ortopedic>e= ortopedicRepositorio.getOrtopedic(ortopedic.getId());
            if(e.isEmpty()){
                return ortopedicRepositorio.save(ortopedic);
            }else{
                return ortopedic;
            }
        }
    }
    
       public Ortopedic update(Ortopedic ortopedic){
        if(ortopedic.getId()!=null){
            Optional<Ortopedic> e= ortopedicRepositorio.getOrtopedic(ortopedic.getId());
            if(!e.isEmpty()){
                if(ortopedic.getName()!=null){
                    e.get().setName(ortopedic.getName());
                }
                if(ortopedic.getBrand()!=null){
                    e.get().setBrand(ortopedic.getBrand());
                }
                if(ortopedic.getYear()!=null){
                    e.get().setYear(ortopedic.getYear());
                }
                if(ortopedic.getDescription()!=null){
                    e.get().setDescription(ortopedic.getDescription());
                }
                if(ortopedic.getCategory()!=null){
                    e.get().setCategory(ortopedic.getCategory());
                }
                ortopedicRepositorio.save(e.get());
                return e.get();
            }else{
                return ortopedic;
            }
        }else{
            return ortopedic;
        }
    }

    
    
      public boolean deleteOrtopedic (int id){
        Boolean d = getOrtopedic(id).map(ortopedic -> {
            ortopedicRepositorio.delete(ortopedic);
            return true;
        }).orElse(false);
        return d;
    }
    
    
}
