/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grupo13.Reto3.Ortesis.Repositorio;

import Grupo13.Reto3.Ortesis.Interface.ClientInterface;
import Grupo13.Reto3.Ortesis.Modelo.Client;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository

public class ClientRepositorio {
    @Autowired
    private ClientInterface clientInterface;
    
      public List<Client> getAll(){
        return (List<Client>) clientInterface.findAll();
    }
    
    public Optional<Client> getClient(int id){
        return clientInterface.findById(id);
    }

    public Client save(Client client){
        return clientInterface.save(client);
    }
     
    public void delete(Client client){
        clientInterface.delete(client);
    }
    
  
}
