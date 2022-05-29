package com.porfolio.gabrielarojas.Service;

import com.porfolio.gabrielarojas.Entity.Roles;
import com.porfolio.gabrielarojas.Interface.IRolesService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolesService  implements IRolesService {
    @Override
    public List<Roles> getRoles() {
        return null;
    }

    @Override
    public void saveRol(Roles rol) {

    }

    @Override
    public void deleteRol(Long id) {

    }

    @Override
    public Roles findRol(Long id) {
        return null;
    }
}
