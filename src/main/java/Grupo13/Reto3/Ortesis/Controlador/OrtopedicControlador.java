/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grupo13.Reto3.Ortesis.Controlador;

import Grupo13.Reto3.Ortesis.Modelo.Ortopedic;
import Grupo13.Reto3.Ortesis.Servicio.OrtopedicServicio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/Ortopedic")
@CrossOrigin (origins ="*",methods ={RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})

public class OrtopedicControlador {
    @Autowired
    private OrtopedicServicio ortopedicServicio;
    @GetMapping("/all")
    public List<Ortopedic> getAll(){
        return ortopedicServicio.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Ortopedic> getOrtopedic(@PathVariable("id") int id) {
        return ortopedicServicio.getOrtopedic(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Ortopedic save(@RequestBody Ortopedic ortopedic) {
        return ortopedicServicio.save(ortopedic);
    }
    
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Ortopedic update(@RequestBody Ortopedic ortopedic) {
        return ortopedicServicio.update(ortopedic);
    }
    
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int id){
        return ortopedicServicio.deleteOrtopedic(id);
    }
    
  
}
