/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grupo13.Reto3.Ortesis.Repositorio;

import Grupo13.Reto3.Ortesis.Interface.ReservationInterface;
import Grupo13.Reto3.Ortesis.Modelo.Reservation;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USUARIO
 */
@Repository

public class ReservationRepositorio {

    @Autowired
    private ReservationInterface reservationInterface;

    public List<Reservation> getAll() {
        return (List<Reservation>) reservationInterface.findAll();
    }

    public Optional<Reservation> getReservation(int id) {
        return reservationInterface.findById(id);
    }

    public Reservation save(Reservation reservation) {
        return reservationInterface.save(reservation);
    }
    
    public void delete(Reservation reservation){
        reservationInterface.delete(reservation);
    }
    
  
}
