package com.porfolio.gabrielarojas.Service;

import com.porfolio.gabrielarojas.Entity.Educacion;
import com.porfolio.gabrielarojas.Interface.IEducacionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducacionService  implements IEducacionService {
    @Override
    public List<Educacion> getEducacion() {
        return null;
    }

    @Override
    public void saveEducacion(Educacion educacion) {

    }

    @Override
    public void deleteEducacion(Long id) {

    }

    @Override
    public Educacion findEducacion(Long id) {
        return null;
    }
}
