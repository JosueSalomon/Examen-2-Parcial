package examen.lenguajes.josue.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import examen.lenguajes.josue.modelos.TipoCliente;
import examen.lenguajes.josue.repositorios.TipoClienteRepository;
import examen.lenguajes.josue.servicios.TipoClienteService;


@Service

public class TipoClienteServiceImpl implements TipoClienteService {
    
    @Autowired
    private TipoClienteRepository TipoClienteRepository;

    @Override
    public TipoCliente guardaTipoCliente(TipoCliente tipocliente) {
        return TipoClienteRepository.save(tipocliente);
    }
    
}
