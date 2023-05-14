package com.maine.BackEnd.Proyectos;

import java.util.List;

public interface IProyectosService {

// Metodos

public List<Proyectos> verProyectos();

public void crearProyectos(Proyectos proyectos);

public void editarProyectos(Proyectos proyectos);

public void borrarProyectos(Integer id);

public Proyectos buscarProyectos(Integer id);
}
