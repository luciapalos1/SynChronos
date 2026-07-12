package com.SynChronos.features.usuario.model;

import com.SynChronos.features.usuario.Role;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class CredencialEntity {
    /*@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    */
    private UUID idCredencial;

    @Column(nullable = false)
    private String mail;

    @Column(nullable = false)
    private String contrasenia;

    private LocalDate fecha_Nacimiento;

    private String dni;

    private Role role;

    @PrePersist
    void alGuardar(){
        if (idCredencial == null)
            idCredencial = UUID.randomUUID();
    }
}
