package com.SynChronos.features.usuario.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private UUID idUsuario;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellido;

    @Column(nullable = false)
    private String telefono;

    @Embedded
    private CredencialEntity credencial;

    private Boolean activo;

    @PrePersist
    void alGuardar(){
        if (idUsuario == null)
            idUsuario = UUID.randomUUID();
        if (activo == null)
            activo = true;
    }
}
