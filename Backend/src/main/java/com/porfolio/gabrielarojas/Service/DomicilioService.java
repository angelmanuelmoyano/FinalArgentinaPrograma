package com.porfolio.gabrielarojas.Service;

import com.porfolio.gabrielarojas.Entity.Domicilio;
import com.porfolio.gabrielarojas.Interface.IDomicilioService;
import com.porfolio.gabrielarojas.Repository.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DomicilioService  implements IDomicilioService {
    @Autowired
    DomicilioRepository domicilioRepository;


    @Override
    public List<Domicilio> getDomicilios() {
        return null;
    }

    @Override
    public void saveDomicilio(Domicilio domicilio) {

    }

    @Override
    public void deleteDomicilio(Long id) {

    }

    @Override
    public Domicilio findDomicilio(Long id) {
        return null;
    }
}
