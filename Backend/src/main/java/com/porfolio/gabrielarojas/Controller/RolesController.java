package com.porfolio.gabrielarojas.Controller;

import com.porfolio.gabrielarojas.Entity.Persona;
import com.porfolio.gabrielarojas.Entity.Roles;
import com.porfolio.gabrielarojas.Service.RolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RolesController {
  @Autowired
    RolesService rolesService;
    @GetMapping("/roles/traer")
    public List<Roles> getRoles(){
        return rolesService.getRoles();
    }
    @PostMapping("/roles/crear")
    public String createRol(@RequestBody Roles rol){
        rolesService.saveRol(rol);
        return "Rol Creado";
    }
    @DeleteMapping("/roles/borrar/{id}")
    public String deleteRol(@PathVariable Long id){
        rolesService.deleteRol(id);
        return "El rol fue eliminado";
    }
    @PutMapping("/roles/editar/{id}")
    public Roles editRol(@PathVariable Long id,
                               @RequestParam("nombre_rol") String nombre_rol
                              ){

        Roles rol= rolesService.findRol(id);
        rol.setNombreRol(nombre_rol);;
         rolesService.saveRol(rol);
        return rol;
    }
}


