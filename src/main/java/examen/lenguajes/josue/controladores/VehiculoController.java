package examen.lenguajes.josue.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import examen.lenguajes.josue.modelos.Vehiculos;

import examen.lenguajes.josue.servicios.impl.VehiculosServiceImpl;

@RestController
@RequestMapping("/api/vehiculo")

public class VehiculoController {
    

    @Autowired
    private VehiculosServiceImpl VehiculosServiceImpl;

    @PostMapping("/guardar")
    public Vehiculos guardarTipoVehiculo(@RequestBody Vehiculos Vehiculos) {
        return VehiculosServiceImpl.guardarVehiculo(Vehiculos);
    }
}
