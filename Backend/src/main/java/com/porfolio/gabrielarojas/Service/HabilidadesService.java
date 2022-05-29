package com.porfolio.gabrielarojas.Service;

import com.porfolio.gabrielarojas.Entity.Habilidades;
import com.porfolio.gabrielarojas.Interface.IHabilidadesService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HabilidadesService implements IHabilidadesService {
    @Override
    public List<Habilidades> getHabilidades() {
        return null;
    }

    @Override
    public void saveHabilidad(Habilidades habilidad) {

    }

    @Override
    public void deleteHabilidad(Long id) {

    }

    @Override
    public Habilidades findHabilidad(Long id) {
        return null;
    }
}
