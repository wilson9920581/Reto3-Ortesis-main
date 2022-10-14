package Grupo13.Reto3.Ortesis.Repositorio;

import Grupo13.Reto3.Ortesis.Interface.AdminInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AdminRepositorio {
    @Autowired
    AdminInterface adminInterface;
}
