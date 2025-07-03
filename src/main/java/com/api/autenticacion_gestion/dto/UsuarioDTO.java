package com.api.autenticacion_gestion.dto;

import org.springframework.hateoas.RepresentationModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO extends RepresentationModel<UsuarioDTO> {
    private Integer idUsuario;
    private String nombreUsuario;
    private String email;
    private String rol;
    private String estado;

}
