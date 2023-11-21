package examen.lenguajes.josue.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import examen.lenguajes.josue.modelos.TipoVehiculo;
import examen.lenguajes.josue.servicios.impl.TipoVehiculoServiceImpl;

@RestController
@RequestMapping("/api/tipovehiculo")
public class TipoVehiculoController {

    @Autowired
    private TipoVehiculoServiceImpl TipoVehiculoServiceImpl;

    @PostMapping("/guardar")
    public TipoVehiculo guardarTipoVehiculo(@RequestBody TipoVehiculo TipoVehiculo) {
        return TipoVehiculoServiceImpl.guardarTipoVehiculo(TipoVehiculo);
    }
}
