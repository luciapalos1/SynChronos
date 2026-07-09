package com.SynChronos.features.turno.model;

import com.SynChronos.features.agenda.model.AgendaEntity;
import com.SynChronos.features.turno.Estado;
import com.SynChronos.features.usuario.model.UsuarioEntity;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.List;
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

    @Column(name = "turno_id", nullable = false, unique = true)
    private UUID idTurno;

    @Column(name = "horario_entrada",nullable = false)
    private LocalDateTime horarioEntrada;

    @Column(name = "horario_salida",nullable = false)
    private LocalDateTime horarioSalida;

    @Column(nullable = false)
    private Boolean activo;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Estado estado;

    @Column(name = "cupo_maximo", nullable = false)
    private Integer cupoMaximo;

    @Column(name = "cupo_minimo", nullable = false)
    private Integer cupoMinimo;

    @Column(name = "edad_maxima",nullable = false)
    private Integer edadMaxima;

    @Column(name = "edad_minima",nullable = false)
    private Integer edadMinima;

    @ManyToOne
    @JoinColumn(name = "agenda_id")
    private AgendaEntity agenda;

    @ManyToMany
    private List<UsuarioEntity> participantes;




}
