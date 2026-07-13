package com.SynChronos.features.agenda.model;

import com.SynChronos.features.turno.model.TurnoEntity;
import com.SynChronos.features.usuario.model.UsuarioEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter @Builder
@Table
public class AgendaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "agenda_id", nullable = false,unique = true)
    private UUID idAgenda;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private Boolean activo;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private UsuarioEntity usuario;

    @OneToMany(mappedBy = "agenda")
    private List<TurnoEntity> turnos;
}
