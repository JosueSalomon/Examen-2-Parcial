package examen.lenguajes.josue.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;


import examen.lenguajes.josue.modelos.Vehiculos;

public interface VehiculosRepository extends JpaRepository<Vehiculos, Integer> {
    
}
