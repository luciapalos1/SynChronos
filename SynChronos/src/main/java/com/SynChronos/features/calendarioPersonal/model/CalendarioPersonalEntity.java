package com.SynChronos.features.calendarioPersonal.model;

import com.SynChronos.features.usuario.model.UsuarioEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class CalendarioPersonalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private UUID idCalendarioPersonal;

    @ManyToOne
    private UsuarioEntity usuario;

    /*
    private calendarioTurnos

    private calendarioAgenda
     */
}
