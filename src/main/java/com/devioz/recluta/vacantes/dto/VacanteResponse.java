package com.devioz.recluta.vacantes.dto;

import com.devioz.recluta.vacantes.entity.EstadoVacante;
import com.devioz.recluta.vacantes.entity.Modalidad;
import com.devioz.recluta.vacantes.entity.Seniority;

import java.math.BigDecimal;

public record VacanteResponse(
        Long id,
        String titulo,
        String cliente,
        Seniority seniority,
        BigDecimal salarioMinimo,
        BigDecimal salarioMaximo,
        Modalidad modalidad,
        EstadoVacante estado) {
}



