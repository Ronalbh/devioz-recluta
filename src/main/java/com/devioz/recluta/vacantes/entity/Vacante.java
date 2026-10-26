package com.devioz.recluta.vacantes.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "vacantes")
@Getter
@Setter
@NoArgsConstructor
public class Vacante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String cliente;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Seniority seniority;

    @Column(name = "salario_minimo", precision = 10, scale = 2)
    private BigDecimal salarioMinimo;

    @Column(name = "salario_maximo", precision = 10, scale = 2)
    private BigDecimal salarioMaximo;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Modalidad modalidad;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EstadoVacante estado;
}