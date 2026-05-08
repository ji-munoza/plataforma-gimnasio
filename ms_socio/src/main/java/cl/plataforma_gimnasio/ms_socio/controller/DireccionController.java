package cl.plataforma_gimnasio.ms_socio.controller;

import cl.plataforma_gimnasio.ms_socio.model.Direccion;
import cl.plataforma_gimnasio.ms_socio.model.Socio;
import cl.plataforma_gimnasio.ms_socio.service.DireccionService;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gimnasio/socios/direcciones")
@RequiredArgsConstructor
public class DireccionController {
    private final DireccionService direccionService;

    @GetMapping
    public ResponseEntity<List<Direccion>> obtenerTodos(){
        List<Direccion> direcciones = direccionService.obtenerTodos();
        if (direcciones.isEmpty()){
            return  ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(direcciones);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Direccion> obtenerPorId(@PathVariable Integer id){
        return direccionService.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Direccion> guardar(@RequestBody Direccion direccion){
        return ResponseEntity.status(201).body(direccionService.guardar(direccion));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id){
        if (direccionService.obtenerPorId(id).isEmpty()){
            return ResponseEntity.notFound().build();
        }
        direccionService.eliminar(id);
        return ResponseEntity.noContent().build();
    }

}
