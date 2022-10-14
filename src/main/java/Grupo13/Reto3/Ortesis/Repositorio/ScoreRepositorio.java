package Grupo13.Reto3.Ortesis.Repositorio;

import Grupo13.Reto3.Ortesis.Interface.ScoreInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ScoreRepositorio {
    @Autowired
    ScoreInterface scoreInterface;
}
