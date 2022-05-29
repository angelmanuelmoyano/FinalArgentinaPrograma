package com.porfolio.gabrielarojas.Service;

import com.porfolio.gabrielarojas.Entity.Roles;
import com.porfolio.gabrielarojas.Entity.Roles_Persona;
import com.porfolio.gabrielarojas.Interface.IRoles_PersonaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolesPersonaService  implements IRoles_PersonaService {
    @Override
    public List<Roles_Persona> getRolesPersona() {
        return null;
    }

    @Override
    public void saveRolesPersona(Roles_Persona rolesPersona) {

    }

    @Override
    public void deleteRolesPersona(Long id) {

    }

    @Override
    public Roles_Persona findRolesPersona(Long id) {
        return null;
    }
}
