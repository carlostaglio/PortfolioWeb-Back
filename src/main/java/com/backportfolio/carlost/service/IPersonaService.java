
package com.backportfolio.carlost.service;

import com.backportfolio.carlost.model.Persona;
import java.util.List;

public interface IPersonaService {
    
    public List<Persona> verPersona();
    public void crearPersona (Persona pers);
    public void borrarPersona (Long id);
    public Persona buscarPersona (Long id);
    public void editarPersona(Persona pers);
}
