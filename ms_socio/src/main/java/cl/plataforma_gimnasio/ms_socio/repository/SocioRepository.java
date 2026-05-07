package cl.plataforma_gimnasio.ms_socio.repository;

import cl.plataforma_gimnasio.ms_socio.model.Socio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocioRepository extends JpaRepository<Socio, Integer> {

}
