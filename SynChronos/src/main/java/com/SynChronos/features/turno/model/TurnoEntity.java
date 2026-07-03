package com.SynChronos.features.turno.model;

import com.SynChronos.features.agenda.model.AgendaEntity;
import com.SynChronos.features.turno.Estado;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter @Builder
@Table
public class TurnoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "id", nullable = false, unique = true)
    private UUID idTurno;

    @Column(name = "Horario entrada",nullable = false)
    private LocalDateTime horarioEntrada;

    @Column(name = "Horario salida",nullable = false)
    private LocalDateTime horarioSalida;

    @Column(nullable = false)
    private Boolean activo;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Estado estado;

    @Column(name = "Cupo maximo", nullable = false)
    private Integer cupoMaximo;

    @Column(name = "Cupo mamo", nullable = false)
    private Integer cupoMinimo;

    @Column(name = "Edad maxima",nullable = false)
    private Integer edadMaxima;

    @Column(name = "Edad minima",nullable = false)
    private Integer edadMinima;




}
