package com.maine.BackEnd.Experiencia;

import java.util.List;

public interface IExperienciaService {

// Metodos

public List<Experiencia> verExperiencias();

public void crearExperiencia(Experiencia experiencia);

public void editarExperiencia(Experiencia experiencia);

public void borrarExperiencia(Integer id);

public Experiencia buscarExperiencia(Integer id);

}
