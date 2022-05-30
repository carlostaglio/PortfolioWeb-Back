
package com.backportfolio.carlost.controller;

import com.backportfolio.carlost.model.Social;
import com.backportfolio.carlost.service.ISocialService;
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
public class SocialController {
    
    @Autowired
    private ISocialService socialServ;
    
    @PostMapping ("/api/new/social")
    public Social agregarSocial(@RequestBody Social soc) {
        socialServ.crearSocial(soc);
        return soc;
    }
    
    @GetMapping ("/api/ver/socials")
    @ResponseBody
    public List<Social> verSocials () {
        return socialServ.verSocial();
    }
    
    @DeleteMapping ("/api/delete/social/{id}")
    public Long borrarSocial (@PathVariable Long id) {
        socialServ.borrarSocial(id);
        return id;
    }
    
    @PutMapping ("/api/editar/social")
    public Social editarSocial (@RequestBody Social soc) {
        socialServ.editarSocial(soc);
        return soc;
    }
}
