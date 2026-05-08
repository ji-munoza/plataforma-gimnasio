package cl.plataforma_gimnasio.ms_socio.service;

import cl.plataforma_gimnasio.ms_socio.model.Direccion;
import cl.plataforma_gimnasio.ms_socio.model.Socio;
import cl.plataforma_gimnasio.ms_socio.repository.DireccionRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class DireccionService {
    private final DireccionRepository direccionRepository;

    public List<Direccion> obtenerTodos() { return direccionRepository.findAll();}

    public Optional<Direccion> obtenerPorId(Integer id) { return direccionRepository.findById(id);}

    public Direccion guardar(Direccion direccion){ return direccionRepository.save(direccion);}

    public void eliminar(Integer id){ direccionRepository.deleteById(id);}

}
