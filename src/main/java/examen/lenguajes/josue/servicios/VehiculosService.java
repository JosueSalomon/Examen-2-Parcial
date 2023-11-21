package examen.lenguajes.josue.servicios;

import java.util.List;

import examen.lenguajes.josue.modelos.Clientes;
import examen.lenguajes.josue.modelos.Vehiculos;

public interface VehiculosService {
    
    public Vehiculos guardarVehiculo(Vehiculos vehiculo);

    public List<Vehiculos> obtenerTodos();

    public Vehiculos ObtenervehículoporID(int id);
}

