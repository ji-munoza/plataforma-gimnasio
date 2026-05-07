package cl.plataforma_gimnasio.ms_socio.service;

import cl.plataforma_gimnasio.ms_socio.model.Socio;
import cl.plataforma_gimnasio.ms_socio.repository.SocioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SocioService {
    private final SocioRepository socioRepository;

    public List<Socio> obtenerTodos(){
        return socioRepository.findAll();
    }

    public Optional<Socio> obtenerPorId(Integer id){
        return socioRepository.findById(id);
    }

    public Socio guardar(Socio socio) {
        return socioRepository.save(socio);
    }

    public void eliminar(Integer id) {
        socioRepository.deleteById(id);
    }

}
