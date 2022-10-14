/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grupo13.Reto3.Ortesis.Repositorio;

import Grupo13.Reto3.Ortesis.Interface.OrtopedicInterface;
import Grupo13.Reto3.Ortesis.Modelo.Ortopedic;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USUARIO
 */
@Repository

public class OrtopedicRepositorio {
    @Autowired
    private OrtopedicInterface ortopedicInterface;
    
      public List<Ortopedic> getAll(){
        return (List<Ortopedic>) ortopedicInterface.findAll();
    }
    
    public Optional<Ortopedic> getOrtopedic(int id){
        return ortopedicInterface.findById(id);
    }

    public Ortopedic save(Ortopedic ortopedic){
        return ortopedicInterface.save(ortopedic);
    }
    
     public void delete(Ortopedic ortopedic){
        ortopedicInterface.delete(ortopedic);
    }
    
     
    
}
