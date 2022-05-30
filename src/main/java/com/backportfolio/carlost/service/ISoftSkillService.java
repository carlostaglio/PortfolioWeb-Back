
package com.backportfolio.carlost.service;

import com.backportfolio.carlost.model.SoftSkill;
import java.util.List;


public interface ISoftSkillService {
    public List<SoftSkill> verSoftSkill();
    public void crearSoftSkill (SoftSkill softskill);
    public void borrarSoftSkill (Long id);
    public SoftSkill buscarSoftSkill (Long id);
    public void editarSoftSkill(SoftSkill softskill);
}
