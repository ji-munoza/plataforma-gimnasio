package cl.plataforma_gimnasio.ms_socio.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "socios")

public class Socio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_socio")
    private Integer idSocio;

    @Column(name = "rut_socio", nullable = false, unique = true)
    private Integer rutSocio;

    @Column(name = "dv_socio", nullable = false, length = 1)
    private String dvSocio;

    @Column(name = "nombre_socio", nullable = false, length = 50)
    private String nombreSocio;

    @Column(name = "apellido_socio", nullable = false, length = 50)
    private String apellidoSocio;

    @Column(name = "correo_socio", nullable = false, unique = true,length = 50)
    private String correoSocio;

    @Column(name = "telefono_socio", nullable = false, unique = true)
    private Integer telefonoSocio;
}
