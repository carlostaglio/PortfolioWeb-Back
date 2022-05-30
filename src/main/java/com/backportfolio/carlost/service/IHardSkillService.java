
package com.backportfolio.carlost.service;

import com.backportfolio.carlost.model.HardSkill;
import java.util.List;


public interface IHardSkillService {
    public List<HardSkill> verHardSkill();
    public void crearHardSkill (HardSkill hardskill);
    public void borrarHardSkill (Long id);
    public HardSkill buscarHardSkill (Long id);
    public void editarHardSkill(HardSkill hardskill);
}
