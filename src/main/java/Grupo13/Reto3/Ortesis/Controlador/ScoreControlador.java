package Grupo13.Reto3.Ortesis.Controlador;

import Grupo13.Reto3.Ortesis.Servicio.ScoreServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScoreControlador {
    @Autowired
    private ScoreServicio scoreServicio;
}
