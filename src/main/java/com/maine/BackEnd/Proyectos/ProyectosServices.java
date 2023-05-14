package com.maine.BackEnd.Proyectos;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

@Service
@Transactional

public class ProyectosServices implements IProyectosService{

    @Autowired
    public ProyectosRepository proyectosRepository;

    @Override
    public List<Proyectos> verProyectos() {
       return proyectosRepository.findAll();
    }

    @Override
    public void crearProyectos(Proyectos proyectos) {
        proyectosRepository.save(proyectos);
    }

    @Override
    public void editarProyectos(Proyectos proyectos) {
        Optional <Proyectos> proye = proyectosRepository.findById(proyectos.getId());

        if(proye.isPresent()){
            Proyectos proyectito = proye.get();
            proyectito.setNombre(proyectos.getNombre());
            proyectito.setDescripcion(proyectos.getDescripcion());
            proyectito.setUrlImg(proyectos.getUrlImg());
            proyectito.setEnlace(proyectos.getEnlace());
            proyectosRepository.save(proyectito);
        }else{
            throw new RuntimeException("Proyecto no encontrado");
        }
    }

    @Override
    public void borrarProyectos(Integer id) {
        proyectosRepository.deleteById(id);
    }

    @Override
    public Proyectos buscarProyectos(Integer id) {
        return proyectosRepository.findById(id).orElse(null);
    }
    
}
