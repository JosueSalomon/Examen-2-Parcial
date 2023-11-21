package examen.lenguajes.josue.servicios.impl;

import examen.lenguajes.josue.modelos.Vehiculos;
import examen.lenguajes.josue.repositorios.VehiculosRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import examen.lenguajes.josue.servicios.VehiculosService;

@Service
public class VehiculosServiceImpl implements VehiculosService {

    @Autowired
    private VehiculosRepository VehiculosRepository;

    @Override
    public Vehiculos guardarVehiculo(Vehiculos vehiculo) {
        return VehiculosRepository.save(vehiculo);
    }

    @Override
    public List<Vehiculos> obtenerTodos() {
        return this.VehiculosRepository.findAll();
    }

    @Override
    public Vehiculos ObtenervehículoporID(int id) {
        Vehiculos vehiculoEncontrado = this.VehiculosRepository.findById(id).get();

        if(vehiculoEncontrado != null) {
            return vehiculoEncontrado;
        }

        return null;
    }

    
}
