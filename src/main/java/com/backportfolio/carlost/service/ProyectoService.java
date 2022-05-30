
package com.backportfolio.carlost.service;

import com.backportfolio.carlost.model.Proyecto;
import com.backportfolio.carlost.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService{

    @Autowired
    public ProyectoRepository proyecRepo;
    
    @Override
    public List<Proyecto> verProyecto() {
        return proyecRepo.findAll();
    }

    @Override
    public void crearProyecto(Proyecto proy) {
        proyecRepo.save(proy);
    }

    @Override
    public void borrarProyecto(Long id) {
        proyecRepo.deleteById(id);
    }

    @Override
    public Proyecto buscarProyecto(Long id) {
        return proyecRepo.findById(id).orElse(null);
    }
    
    @Override
    public void editarProyecto(Proyecto proy) {
        proyecRepo.save(proy);
    }
}

