
package com.backportfolio.carlost.repository;

import com.backportfolio.carlost.model.Social;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocialRepository extends JpaRepository <Social, Long>{
    
}
