package cl.plataforma_gimnasio.ms_socio.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.Length;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "direccion")
public class Direccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_direccion")
    private Integer idDireccion;

    @Column(name = "calle", nullable = false, length = 50)
    private String calle;

    @Column(name = "numero", nullable = false)
    private Integer numero;

    @Column(name = "departamento", nullable = true, length = 50)
    private String departamento;

    @Column(name = "comuna", nullable = false, length = 50)
    private String comuna;

    @Column(name = "region", nullable = false, length = 50)
    private String region;

}
