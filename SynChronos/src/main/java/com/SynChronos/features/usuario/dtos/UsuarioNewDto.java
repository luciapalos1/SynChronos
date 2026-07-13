package com.SynChronos.features.usuario.dtos;

import jakarta.validation.constraints.NotBlank;

public record UsuarioNewDto(@NotBlank String nombre,
                            @NotBlank String apellido,
                            @NotBlank String telefono) {
}
