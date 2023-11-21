package examen.lenguajes.josue.servicios;

import java.util.List;

import examen.lenguajes.josue.modelos.Clientes;
import examen.lenguajes.josue.modelos.Vehiculos;

public interface ClienteService {
    
    public Clientes guardarCliente(Clientes cliente);

    public List<Clientes> obtenerTodos();

    public Clientes ObtenerclienteporID(int id);
}
