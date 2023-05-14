package com.maine.BackEnd.HyS;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

@Service
@Transactional

public class HysService implements IHysService {

    @Autowired
    public HysRepository hysRepository;

    @Override
    public List<Hys> verHys() {
        return hysRepository.findAll();
    }

    @Override
    public void crearHys(Hys hys) {
        hysRepository.save(hys);
    }

    @Override
    public void editarHys(Hys hys) {
        Optional <Hys> skill = hysRepository.findById(hys.getId());

        if(skill.isPresent()){
            Hys hysskill = skill.get();
            hysskill.setNombre(hys.getNombre());
            hysskill.setPorcentaje(hys.getPorcentaje());
            hysRepository.save(hysskill);
        }else{
            throw new RuntimeException("Habilidad no encontrada");
        }
    }

    @Override
    public void borrarHys(Integer id) {
        hysRepository.deleteById(id);
    }

    @Override
    public Hys buscarHys(Integer id) {
        return hysRepository.findById(id).orElse(null);
    }

}
