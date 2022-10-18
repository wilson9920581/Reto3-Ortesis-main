/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grupo13.Reto3.Ortesis.Repositorio;

import Grupo13.Reto3.Ortesis.Interface.ReservationInterface;
import Grupo13.Reto3.Ortesis.Modelo.Client;
import Grupo13.Reto3.Ortesis.Modelo.Reservation;

import java.util.*;

import Grupo13.Reto3.Ortesis.reporte.ContadorClient;
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

    public List<ContadorClient> getTopClients() {
        List<ContadorClient> resultado = new ArrayList<>();
        List<Object[]> reporte = reservationInterface.countTotalReservationByClient();

        for (int i = 0; i < reporte.size(); i++) {
            resultado.add(new ContadorClient((Long) reporte.get(i)[1], (Client) reporte.get(i)[0]));
        }
        return resultado;
    }

    public List<Reservation> getReservacionTiempo(Date fechaInicial, Date fechaFinal){
        return reservationInterface.findAllByStartDateAfterAndStartDateBefore(fechaInicial,fechaFinal);
    }
    public List<Reservation> getReservacionByStatus(String status){
        return reservationInterface.findAllByStatus(status);
    }
    //public   List<Object[]> reporteClientes() {
    // return reservationInterface.reporteClientes();

    //  }


}

