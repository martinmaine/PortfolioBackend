package com.maine.BackEnd.Experiencia;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

@Service
@Transactional

public class ExperienciaService implements IExperienciaService {

    @Autowired
    public ExperienciaRepository experienciaRepository;

    // VER LISTA
    @Override
    public List<Experiencia> verExperiencias() {
        return experienciaRepository.findAll();
    }

    // CREAR Y MODIFICAR
    @Override
    public void crearExperiencia(Experiencia experiencia) {
        experienciaRepository.save(experiencia);
    }

    @Override
    public void editarExperiencia(Experiencia experiencia) {
        Optional <Experiencia> expe = experienciaRepository.findById(experiencia.getId());

        if(expe.isPresent()){
            Experiencia exper = expe.get();
            exper.setPuesto(experiencia.getPuesto());
            exper.setDescripcion(experiencia.getDescripcion());
            experienciaRepository.save(exper);
        }else{
            throw new RuntimeException("Experiencia no encontrada");
        }
    }

    // BORRAR
    @Override
    public void borrarExperiencia(Integer id) {
        experienciaRepository.deleteById(id);
    }

    // BUSCAR UNA EN PARTICULAR
    @Override
    public Experiencia buscarExperiencia(Integer id) {
        return experienciaRepository.findById(id).orElse(null);
    }

}
