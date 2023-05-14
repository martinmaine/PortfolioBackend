package com.maine.BackEnd.Preparacion;

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
@RequestMapping("/preparacion")
@CrossOrigin (origins = "*")
public class PreparacionController {
    
    @Autowired 
    private PreparacionService prepServ;
    
    // MOSTRAR
    @GetMapping("/lista")
    @ResponseBody
    public List<Preparacion> verPreparacion() {
        return prepServ.verPreparacion();
    }

    // CREAR
    @PostMapping("/create")
    public void crearPreparacion(@RequestBody Preparacion preparacion) {
        prepServ.crearPreparacion(preparacion);
    }

    // BORRAR
    @DeleteMapping("/delete/{id}")
    public void borrarPreparacion(@PathVariable Integer id) {
        prepServ.borrarPreparacion(id);
    }

    // EDITAR
    @PutMapping ("/editar/")
    public void editarCurso(@RequestBody Preparacion preparacion){
        prepServ.editarPreparacion(preparacion);
    }

}
