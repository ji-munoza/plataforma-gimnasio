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
public class SocioRequestDTO {
    @NotNull(message = "El rut no puede estar vacio")
    private Integer rutSocio;

    @NotBlank(message = "Debe ingresar un digito verificador")
    private String dvSocio;

    @NotBlank(message = "El nombre no puede estar vacio")
    private String nombreSocio;

    @NotBlank(message = "El apellido no puede estar vacio")
    private String apellidoSocio;

    @Email(message = "El correo ingresado no es valido")
    private String correoSocio;

    @NotNull(message = "Debe ingresar un numero de telefono")
    private Integer telefonoSocio;
}
