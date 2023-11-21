package examen.lenguajes.josue.controladores;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("buscar/{idVehiculo}")
    public Vehiculos buscarArtista(@PathVariable(name="idVehiculo") int idVehiculo) {
        return VehiculosServiceImpl.ObtenervehículoporID(idVehiculo);
    }

    @GetMapping("/obtenervehiculos")
    public List<Vehiculos> obtenervhiculos() {
        return VehiculosServiceImpl.obtenerTodos();
    }
}
