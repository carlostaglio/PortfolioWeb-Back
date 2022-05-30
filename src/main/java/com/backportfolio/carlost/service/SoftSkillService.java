
package com.backportfolio.carlost.service;

import com.backportfolio.carlost.model.SoftSkill;
import com.backportfolio.carlost.repository.SoftSkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SoftSkillService implements ISoftSkillService{

    @Autowired
    public SoftSkillRepository softskiRepo;
    
    @Override
    public List<SoftSkill> verSoftSkill() {
        return softskiRepo.findAll();
    }

    @Override
    public void crearSoftSkill(SoftSkill softskill) {
        softskiRepo.save(softskill);
    }

    @Override
    public void borrarSoftSkill(Long id) {
        softskiRepo.deleteById(id);
    }

    @Override
    public SoftSkill buscarSoftSkill(Long id) {
        return softskiRepo.findById(id).orElse(null);
    }
    
    @Override
    public void editarSoftSkill(SoftSkill softskill) {
        softskiRepo.save(softskill);
    }
}

