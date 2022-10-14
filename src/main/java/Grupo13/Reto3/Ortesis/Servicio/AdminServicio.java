package Grupo13.Reto3.Ortesis.Servicio;

import Grupo13.Reto3.Ortesis.Repositorio.AdminRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServicio {
    @Autowired
    AdminRepositorio adminRepositorio;
}
