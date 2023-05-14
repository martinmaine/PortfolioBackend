package com.maine.BackEnd.Preparacion;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class PreparacionService implements IPreparacionService {

    @Autowired
    PreparacionRepository preparacionRepository;

    @Override
    public List<Preparacion> verPreparacion() {
        return preparacionRepository.findAll();
    }

    @Override
    public void crearPreparacion(Preparacion preparacion) {
        preparacionRepository.save(preparacion);
    }

    @Override
    public void editarPreparacion(Preparacion preparacion) {
        Optional <Preparacion> prepa = preparacionRepository.findById(preparacion.getId());

        if(prepa.isPresent()){
            Preparacion cursito = prepa.get();
            cursito.setCurso(preparacion.getCurso());
            cursito.setInstitucion(preparacion.getInstitucion());
            preparacionRepository.save(cursito);
        }else{
            throw new RuntimeException("Curso no encontrado");
        }
    }

    @Override
    public void borrarPreparacion(Integer id) {
        preparacionRepository.deleteById(id);
    }

    @Override
    public Preparacion buscarPreparacion(Integer id) {
        return preparacionRepository.findById(id).orElse(null);
    }

}
