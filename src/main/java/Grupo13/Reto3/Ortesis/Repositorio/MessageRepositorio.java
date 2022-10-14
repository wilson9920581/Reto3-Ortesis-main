/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grupo13.Reto3.Ortesis.Repositorio;

import Grupo13.Reto3.Ortesis.Interface.MessageInterface;
import Grupo13.Reto3.Ortesis.Modelo.Message;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository

public class MessageRepositorio {

    @Autowired
    private MessageInterface messageInterface;

    public List<Message> getAll() {
        return (List<Message>) messageInterface.findAll();
    }

    public Optional<Message> getMessage(int id) {
        return messageInterface.findById(id);
    }

    public Message save(Message message) {
        return messageInterface.save(message);
    }
     
    public void delete(Message message){
        messageInterface.delete(message);
    }
    
    
   
}
