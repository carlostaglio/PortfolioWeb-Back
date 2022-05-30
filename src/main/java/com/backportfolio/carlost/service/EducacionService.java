
package com.backportfolio.carlost.service;

import com.backportfolio.carlost.model.Educacion;
import com.backportfolio.carlost.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService{

    @Autowired
    public EducacionRepository educacRepo;
    
    @Override
    public List<Educacion> verEducacion() {
        return educacRepo.findAll();
    }

    @Override
    public void crearEducacion(Educacion educ) {
        educacRepo.save(educ);
    }

    @Override
    public void borrarEducacion(Long id) {
        educacRepo.deleteById(id);
    }

    @Override
    public Educacion buscarEducacion(Long id) {
        return educacRepo.findById(id).orElse(null);
    }

    @Override
    public void editarEducacion(Educacion educ) {
        educacRepo.save(educ);
    }
}
