package com.maine.BackEnd.Preparacion;

import java.util.List;

public interface IPreparacionService {

// Metodos

public List<Preparacion> verPreparacion();

public void crearPreparacion(Preparacion preparacion);

public void editarPreparacion(Preparacion preparacion);

public void borrarPreparacion(Integer id);

public Preparacion buscarPreparacion(Integer id);

}
