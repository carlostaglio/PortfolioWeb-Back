
package com.backportfolio.carlost.repository;

import com.backportfolio.carlost.model.HardSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HardSkillRepository extends JpaRepository <HardSkill, Long>{
    
}
