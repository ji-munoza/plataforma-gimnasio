package cl.plataforma_gimnasio.ms_socio.repository;

import cl.plataforma_gimnasio.ms_socio.model.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DireccionRepository extends JpaRepository<Direccion, Integer> {

}
