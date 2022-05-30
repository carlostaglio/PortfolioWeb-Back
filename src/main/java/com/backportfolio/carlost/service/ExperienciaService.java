
package com.backportfolio.carlost.service;

import com.backportfolio.carlost.model.Experiencia;
import com.backportfolio.carlost.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{

    @Autowired
    public ExperienciaRepository experRepo;
    
    @Override
    public List<Experiencia> verExperiencia() {
        return experRepo.findAll();
    }

    @Override
    public void crearExperiencia(Experiencia exp) {
        experRepo.save(exp);
    }

    @Override
    public void borrarExperiencia(Long id) {
        experRepo.deleteById(id);
    }

    @Override
    public Experiencia buscarExperiencia(Long id) {
        return experRepo.findById(id).orElse(null);
    }
    
    @Override
    public void editarExperiencia(Experiencia exp) {
        experRepo.save(exp);
    }
}

