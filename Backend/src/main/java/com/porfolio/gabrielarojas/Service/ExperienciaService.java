package com.porfolio.gabrielarojas.Service;

import com.porfolio.gabrielarojas.Entity.Experiencia;
import com.porfolio.gabrielarojas.Interface.IExperienciaService;
import com.porfolio.gabrielarojas.Repository.ExperienciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienciaService implements IExperienciaService {
    @Autowired
    ExperienciaRepository experienciaRepository;


    @Override
    public List<Experiencia> getExperiencia() {
        return null;
    }

    @Override
    public void saveExperiencia(Experiencia experiencia) {

    }

    @Override
    public void deleteExperiencia(Long id) {

    }

    @Override
    public Experiencia findExperiencia(Long id) {
        return null;
    }
}
