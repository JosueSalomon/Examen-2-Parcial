package examen.lenguajes.josue.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import examen.lenguajes.josue.modelos.Clientes;
import examen.lenguajes.josue.modelos.Vehiculos;
import examen.lenguajes.josue.repositorios.VehiculosRepository;
import examen.lenguajes.josue.repositorios.clienterepository;
import examen.lenguajes.josue.servicios.ClienteService;


@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private clienterepository clienterepository;

    @Override
    public Clientes guardarCliente(Clientes cliente) {
    return clienterepository.save(cliente);
    }

    @Override
    public List<Clientes> obtenerTodos() {
            return this.clienterepository.findAll();
    }

    @Override
    public Clientes ObtenerclienteporID(int id) {
        Clientes clienteEncontrado = this.clienterepository.findById(id).get();

        if(clienteEncontrado != null) {
            return clienteEncontrado;
        }

        return null;
    }
    
}
