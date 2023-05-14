package com.maine.BackEnd.HyS;

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
@RequestMapping("/hys")
@CrossOrigin(origins = "*")

public class HysController {

    @Autowired
    private IHysService hysSer;

    // MOSTRAR
    @GetMapping("/lista")
    @ResponseBody
    public List<Hys> verHys() {
        return hysSer.verHys();
    }

    // CREAR
    @PostMapping("/create")
    public void crearHys(@RequestBody Hys hys) {
        hysSer.crearHys(hys);
    }

    // BORRAR
    @DeleteMapping("/delete/{id}")
    public void borrarHys(@PathVariable Integer id) {
        hysSer.borrarHys(id);
    }

    // EDITAR
    @PutMapping("/editar/")
    public void editarHys(@RequestBody Hys hys) {
        hysSer.editarHys(hys);
    }

}
