
package com.backportfolio.carlost.controller;

import com.backportfolio.carlost.model.Educacion;
import com.backportfolio.carlost.service.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins="https://portfolioweb-front.web.app/")
public class EducacionController {

    @Autowired
    private IEducacionService educacServ;
    
    @PostMapping ("/api/new/educacion")
    public Educacion agregarEducacion(@RequestBody Educacion educ) {
        educacServ.crearEducacion(educ);
        return educ;
    }
    
    @GetMapping ("/api/ver/educaciones")
    @ResponseBody
    public List<Educacion> verEducaciones () {
        return educacServ.verEducacion();
    }
    
    @DeleteMapping ("/api/delete/educacion/{id}")
    public Long borrarEducacion (@PathVariable Long id) {
        educacServ.borrarEducacion(id);
        return id;
    }
    
    @PutMapping ("/api/editar/educacion")
    public Educacion editarEducacion (@RequestBody Educacion educ) {
        educacServ.editarEducacion(educ);
        return educ;
    }
    
}
