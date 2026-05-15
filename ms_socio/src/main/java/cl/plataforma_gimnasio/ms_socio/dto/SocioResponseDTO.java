package cl.plataforma_gimnasio.ms_socio.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SocioResponseDTO {
    private Integer rutSocio;
    private String dvSocio;
    private String nombreSocio;
    private String apellidoSocio;
    private String correoSocio;
    private Integer telefonoSocio;
}
