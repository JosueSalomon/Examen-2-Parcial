package examen.lenguajes.josue.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import examen.lenguajes.josue.modelos.TipoCliente;
import examen.lenguajes.josue.servicios.impl.TipoClienteServiceImpl;


@RestController
@RequestMapping("/api/tipoCliente")
public class TipoClienteController {

    @Autowired
    private TipoClienteServiceImpl tiposerviceimpl;

    @PostMapping("/guardar")
    public TipoCliente guardaTipoCliente(@RequestBody TipoCliente TipoCliente) {
        return tiposerviceimpl.guardaTipoCliente(TipoCliente);
    }
}
