
package com.backportfolio.carlost.controller;

import com.backportfolio.carlost.model.HardSkill;
import com.backportfolio.carlost.service.IHardSkillService;
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
public class HardSkillController {

    @Autowired
    private IHardSkillService hardskiServ;
    
    @PostMapping ("/api/new/hardskill")
    public HardSkill agregarHardSkill(@RequestBody HardSkill hardskill) {
        hardskiServ.crearHardSkill(hardskill);
        return hardskill;
    }
    
    @GetMapping ("/api/ver/hardskills")
    @ResponseBody
    public List<HardSkill> verHardSkills () {
        return hardskiServ.verHardSkill();
    }
    
    @DeleteMapping ("/api/delete/hardskill/{id}")
    public Long borrarHardSkill (@PathVariable Long id) {
        hardskiServ.borrarHardSkill(id);
        return id;
    }
    
    @PutMapping ("/api/editar/hardskill")
    public HardSkill editarHardSkill (@RequestBody HardSkill hardskill) {
        hardskiServ.editarHardSkill(hardskill);
        return hardskill;
    }
    
}
