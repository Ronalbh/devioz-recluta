package com.devioz.recluta.vacantes.dto;

import com.devioz.recluta.vacantes.entity.Modalidad;
import com.devioz.recluta.vacantes.entity.Seniority;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

import java.math.BigDecimal;

public record VacanteRequest(
        @NotBlank(message = "El título es obligatorio")
        String titulo,

        @NotBlank(message = "El cliente es obligatorio")
        String cliente,

        @NotNull(message = "El seniority es obligatorio")
        Seniority seniority,

        @PositiveOrZero(message = "El salario mínimo no puede ser negativo")
        @Digits(integer = 8, fraction = 2, message = "El salario mínimo tiene un formato no válido")
        BigDecimal salarioMinimo,

        @PositiveOrZero(message = "El salario máximo no puede ser negativo")
        @Digits(integer = 8, fraction = 2, message = "El salario máximo tiene un formato no válido")
        BigDecimal salarioMaximo,

        @NotNull(message = "La modalidad es obligatoria")
        Modalidad modalidad) {
}