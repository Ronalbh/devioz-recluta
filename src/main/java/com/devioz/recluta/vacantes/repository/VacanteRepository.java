package com.devioz.recluta.vacantes.repository;

import com.devioz.recluta.vacantes.entity.EstadoVacante;
import com.devioz.recluta.vacantes.entity.Vacante;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VacanteRepository extends JpaRepository<Vacante, Long> {

    List<Vacante> findByEstado(EstadoVacante estado);
}