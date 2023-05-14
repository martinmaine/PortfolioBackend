package com.maine.BackEnd.Proyectos;

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
@RequestMapping("/proyectos")
@CrossOrigin(origins = "*")
public class ProyectosController {
    @Autowired
    private IProyectosService proSer;

    // MOSTRAR
    @GetMapping("/lista")
    @ResponseBody
    public List<Proyectos> verProyectos() {
        return proSer.verProyectos();
    }

    // CREAR
    @PostMapping("/create")
    public void crearProyectos(@RequestBody Proyectos proyectos) {
        proSer.crearProyectos(proyectos);
    }

    // BORRAR
    @DeleteMapping("/delete/{id}")
    public void borrarProyectos(@PathVariable Integer id) {
        proSer.borrarProyectos(id);
    }

    // EDITAR
    @PutMapping("/editar/")
    public void editarProyecto(@RequestBody Proyectos proyectos) {
        proSer.editarProyectos(proyectos);
    }

}
