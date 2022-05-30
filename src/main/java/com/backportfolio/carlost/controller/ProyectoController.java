
package com.backportfolio.carlost.controller;

import com.backportfolio.carlost.model.Proyecto;
import com.backportfolio.carlost.service.IProyectoService;
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
public class ProyectoController {

    @Autowired
    private IProyectoService proyecServ;
    
    @PostMapping ("/api/new/proyecto")
    public Proyecto agregarProyecto(@RequestBody Proyecto proy) {
        proyecServ.crearProyecto(proy);
        return proy;
    }
    
    @GetMapping ("/api/ver/proyectos")
    @ResponseBody
    public List<Proyecto> verProyectos () {
        return proyecServ.verProyecto();
    }
    
    @DeleteMapping ("/api/delete/proyecto/{id}")
    public Long borrarProyecto (@PathVariable Long id) {
        proyecServ.borrarProyecto(id);
        return id;
    }
    
    @PutMapping ("/api/editar/proyecto")
    public Proyecto editarProyecto (@RequestBody Proyecto proy) {
        proyecServ.editarProyecto(proy);
        return proy;
    }
    
}
