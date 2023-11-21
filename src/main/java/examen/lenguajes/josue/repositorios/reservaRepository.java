package examen.lenguajes.josue.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import examen.lenguajes.josue.modelos.Reserva;

public interface reservaRepository extends JpaRepository<Reserva, Integer> {
    
}
