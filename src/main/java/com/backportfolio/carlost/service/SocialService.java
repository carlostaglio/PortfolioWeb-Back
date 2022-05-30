
package com.backportfolio.carlost.service;

import com.backportfolio.carlost.model.Social;
import com.backportfolio.carlost.repository.SocialRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SocialService implements ISocialService{
    
    @Autowired
    public SocialRepository socialRepo;

    @Override
    public List<Social> verSocial() {
        return socialRepo.findAll();
    }

    @Override
    public void crearSocial(Social soc) {
        socialRepo.save(soc);
    }

    @Override
    public void borrarSocial(Long id) {
        socialRepo.deleteById(id);
    }

    @Override
    public Social buscarSocial(Long id) {
        return socialRepo.findById(id).orElse(null);
    }
    
    @Override
    public void editarSocial(Social soc) {
        socialRepo.save(soc);
    }
    
}
