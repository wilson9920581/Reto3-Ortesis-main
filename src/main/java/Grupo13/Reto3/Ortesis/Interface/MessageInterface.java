/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Grupo13.Reto3.Ortesis.Interface;

import Grupo13.Reto3.Ortesis.Modelo.Message;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author USUARIO
 */
public interface MessageInterface extends CrudRepository <Message, Integer> {
    
}
