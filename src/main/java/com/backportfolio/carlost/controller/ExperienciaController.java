
package com.backportfolio.carlost.controller;

import com.backportfolio.carlost.model.Experiencia;
import com.backportfolio.carlost.service.IExperienciaService;
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
public class ExperienciaController {

    @Autowired
    private IExperienciaService experServ;
    
    @PostMapping ("/api/new/experiencia")
    public Experiencia agregarExperiencia(@RequestBody Experiencia exp) {
        experServ.crearExperiencia(exp);
        return exp;
    }
    
    @GetMapping ("/api/ver/experiencias")
    @ResponseBody
    public List<Experiencia> verExperiencias () {
        return experServ.verExperiencia();
    }
    
    @DeleteMapping ("/api/delete/experiencia/{id}")
    public Long borrarExperiencia (@PathVariable Long id) {
        experServ.borrarExperiencia(id);
        return id;
    }
    
    @PutMapping ("/api/editar/experiencia")
    public Experiencia editarExperiencia (@RequestBody Experiencia exp) {
        experServ.editarExperiencia(exp);
        return exp;
    }
    
}
