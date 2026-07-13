package com.SynChronos.features.usuario.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.NonNull;

import java.time.LocalDateTime;

public record CredencialDto(@NotBlank String mail,
                            @NotBlank String contrasenia,
                            @NonNull LocalDateTime fechaNacimiento,
                            @NotBlank String dni) {
}
