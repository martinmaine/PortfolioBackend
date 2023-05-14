package com.maine.BackEnd.Experiencia;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/experiencia")
@CrossOrigin(origins = "*")
public class ExperienciaController {

    @Autowired
    private IExperienciaService expSer;

    // MOSTRAR
    @GetMapping("/lista")
    @ResponseBody
    public List<Experiencia> verExperiencias() {
        return expSer.verExperiencias();
    }

    // CREAR
    @PostMapping("/create")
    public void crearExperiencia(@RequestBody Experiencia experiencia) {
        expSer.crearExperiencia(experiencia);
    }

    // BORRAR
    @DeleteMapping("/delete/{id}")
    public void borrarExperiencia(@PathVariable Integer id) {
        expSer.borrarExperiencia(id);
    }

    // EDITAR
    @PutMapping("/editar/")
    public void editarExperiencia(@RequestBody Experiencia experiencia) {
        expSer.editarExperiencia(experiencia);
    }
}
