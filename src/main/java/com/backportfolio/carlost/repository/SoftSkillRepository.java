
package com.backportfolio.carlost.repository;

import com.backportfolio.carlost.model.SoftSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoftSkillRepository extends JpaRepository <SoftSkill, Long>{
    
}
