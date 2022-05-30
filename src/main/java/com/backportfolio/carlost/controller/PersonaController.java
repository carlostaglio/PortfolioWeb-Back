
package com.backportfolio.carlost.controller;

import com.backportfolio.carlost.model.Persona;
import com.backportfolio.carlost.service.IPersonaService;
import java.util.ArrayList;
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
public class PersonaController {

    @Autowired
    private IPersonaService persoServ;
    
    @GetMapping ("/api/hola")
    public String decirHola() {
        return "Hola :)";
    }
    
    @PostMapping ("/api/new/persona")
    public Persona agregarPersona(@RequestBody Persona pers) {
        persoServ.crearPersona(pers);
        return pers;
    }
    
    @GetMapping ("/api/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas () {
        return persoServ.verPersona();
    }
    
    @DeleteMapping ("/api/delete/persona/{id}")
    public Long borrarPersona (@PathVariable Long id) {
        persoServ.borrarPersona(id);
        return id;
    }
    
    @PutMapping ("/api/editar/persona")
    public Persona editarPersona (@RequestBody Persona pers) {
        persoServ.editarPersona(pers);
        return pers;
    }
    
}
