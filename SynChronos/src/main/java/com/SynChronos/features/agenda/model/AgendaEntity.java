package com.SynChronos.features.agenda.model;

import com.SynChronos.features.turno.model.TurnoEntity;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.Id;

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

    @Column(name = "id", nullable = false,unique = true)
    private UUID idAgenda;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private Boolean activo;

    @OneToMany
    private List<TurnoEntity> turnos;
}
