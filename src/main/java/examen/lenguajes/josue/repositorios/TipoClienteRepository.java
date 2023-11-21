package examen.lenguajes.josue.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;


import examen.lenguajes.josue.modelos.TipoCliente;

public interface TipoClienteRepository extends JpaRepository<TipoCliente, Integer> {
    
}
