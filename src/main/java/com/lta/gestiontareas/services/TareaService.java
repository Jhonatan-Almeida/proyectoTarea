package com.lta.gestiontareas.services;

import com.lta.gestiontareas.entities.Tarea;

import java.util.List;
import java.util.Optional;

public interface TareaService {

    List<Tarea> getAllTareas();

    Optional<Tarea> getTareaById(Long id);

    Tarea createTarea(Tarea tarea);

    Tarea updateTarea(Long id,Tarea tarea);

    void deleteTarea(Long id);

}
