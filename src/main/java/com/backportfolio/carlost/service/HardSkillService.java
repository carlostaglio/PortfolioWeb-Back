
package com.backportfolio.carlost.service;

import com.backportfolio.carlost.model.HardSkill;
import com.backportfolio.carlost.repository.HardSkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HardSkillService implements IHardSkillService{

    @Autowired
    public HardSkillRepository hardskiRepo;
    
    @Override
    public List<HardSkill> verHardSkill() {
        return hardskiRepo.findAll();
    }

    @Override
    public void crearHardSkill(HardSkill hardskill) {
        hardskiRepo.save(hardskill);
    }

    @Override
    public void borrarHardSkill(Long id) {
        hardskiRepo.deleteById(id);
    }

    @Override
    public HardSkill buscarHardSkill(Long id) {
        return hardskiRepo.findById(id).orElse(null);
    }
    
    @Override
    public void editarHardSkill(HardSkill hardskill) {
        hardskiRepo.save(hardskill);
    }
}

