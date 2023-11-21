package examen.lenguajes.josue.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;


import examen.lenguajes.josue.modelos.TipoVehiculo;

public interface TipoVehiculoRepository extends JpaRepository<TipoVehiculo, Integer> {
    
}
