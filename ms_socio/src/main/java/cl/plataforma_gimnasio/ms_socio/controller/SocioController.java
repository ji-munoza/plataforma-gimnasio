package cl.plataforma_gimnasio.ms_socio.controller;

import cl.plataforma_gimnasio.ms_socio.model.Socio;
import cl.plataforma_gimnasio.ms_socio.service.SocioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gimnasio/socios")
@RequiredArgsConstructor
public class SocioController {
    private final SocioService socioService;

    @GetMapping
    public ResponseEntity<List<Socio>> obtenerTodos(){
        List<Socio> socios = socioService.obtenerTodos();
        if (socios.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(socios);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Socio> obtenerPorId(@PathVariable Integer id){
        return socioService.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Socio> guardar(@RequestBody Socio socio){
        return ResponseEntity.status(201).body(socioService.guardar(socio));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id){
        if (socioService.obtenerPorId(id).isEmpty()){
            return ResponseEntity.notFound().build();
        }
        socioService.eliminar(id);
        return ResponseEntity.noContent().build();
    }

}
