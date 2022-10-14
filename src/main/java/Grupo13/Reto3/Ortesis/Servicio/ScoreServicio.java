package Grupo13.Reto3.Ortesis.Servicio;

import Grupo13.Reto3.Ortesis.Repositorio.ScoreRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoreServicio {
    @Autowired
    ScoreRepositorio scoreRepositorio;
}
