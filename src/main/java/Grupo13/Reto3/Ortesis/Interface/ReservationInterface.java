/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Grupo13.Reto3.Ortesis.Interface;

import Grupo13.Reto3.Ortesis.Modelo.Reservation;
import org.springframework.data.repository.CrudRepository;


public interface ReservationInterface extends CrudRepository <Reservation, Integer> {
    
}
