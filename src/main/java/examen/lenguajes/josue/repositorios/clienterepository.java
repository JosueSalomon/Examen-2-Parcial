package examen.lenguajes.josue.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import examen.lenguajes.josue.modelos.Clientes;

public interface clienterepository extends JpaRepository<Clientes, Integer> {
    
}
