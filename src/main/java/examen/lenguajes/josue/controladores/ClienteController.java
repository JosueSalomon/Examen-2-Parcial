package examen.lenguajes.josue.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import examen.lenguajes.josue.modelos.Clientes;

import examen.lenguajes.josue.servicios.impl.ClienteServiceImpl;


@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
    
    @Autowired
    private ClienteServiceImpl ClienteServiceImpl;

    @PostMapping("/guardar")
    public Clientes guardarTipoVehiculo(@RequestBody Clientes Clientes) {
        return ClienteServiceImpl.guardarCliente(Clientes);
    }
}
