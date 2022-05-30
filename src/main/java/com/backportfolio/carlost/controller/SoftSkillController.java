
package com.backportfolio.carlost.controller;

import com.backportfolio.carlost.model.SoftSkill;
import com.backportfolio.carlost.service.ISoftSkillService;
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
@CrossOrigin("https://portfolioweb-front.web.app/")
public class SoftSkillController {

    @Autowired
    private ISoftSkillService softskiServ;
    
    @PostMapping("/api/new/softskill")
    public SoftSkill agregarSoftSkill(@RequestBody SoftSkill softskill) {
        softskiServ.crearSoftSkill(softskill);
        return softskill;
        
    }
    
    @GetMapping("/api/ver/softskills")
    @ResponseBody
    public List<SoftSkill> verSoftSkills () {
        return softskiServ.verSoftSkill();
    }
    
    @DeleteMapping ("/api/delete/softskill/{id}")
    public Long borrarSoftSkill (@PathVariable Long id) {
        softskiServ.borrarSoftSkill(id);
        return id;
    }
    
    @PutMapping("/api/editar/softskill")
    public SoftSkill editarSoftSkill (@RequestBody SoftSkill softskill) {
        softskiServ.editarSoftSkill(softskill);
        return softskill;
    }
    
}
