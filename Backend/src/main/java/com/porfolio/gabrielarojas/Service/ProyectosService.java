package com.porfolio.gabrielarojas.Service;

import com.porfolio.gabrielarojas.Entity.Proyectos;
import com.porfolio.gabrielarojas.Interface.IProyectosService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProyectosService implements IProyectosService {
    @Override
    public List<Proyectos> getProyectos() {
        return null;
    }

    @Override
    public void saveProyecto(Proyectos proyecto) {

    }

    @Override
    public void deleteProyecto(Long id) {

    }

    @Override
    public Proyectos findProyecto(Long id) {
        return null;
    }
}
