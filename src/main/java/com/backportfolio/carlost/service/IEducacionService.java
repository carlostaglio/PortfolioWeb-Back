
package com.backportfolio.carlost.service;

import com.backportfolio.carlost.model.Educacion;
import java.util.List;


public interface IEducacionService {
    public List<Educacion> verEducacion();
    public void crearEducacion (Educacion educ);
    public void borrarEducacion (Long id);
    public Educacion buscarEducacion (Long id);
    public void editarEducacion(Educacion educ);
    
}
