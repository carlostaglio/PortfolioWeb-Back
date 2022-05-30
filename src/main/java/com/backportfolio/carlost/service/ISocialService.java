
package com.backportfolio.carlost.service;

import java.util.List;
import com.backportfolio.carlost.model.Social;


public interface ISocialService {
    
    public List<Social> verSocial();
    public void crearSocial (Social soc);
    public void borrarSocial (Long id);
    public Social buscarSocial (Long id);
    public void editarSocial(Social soc);
}
