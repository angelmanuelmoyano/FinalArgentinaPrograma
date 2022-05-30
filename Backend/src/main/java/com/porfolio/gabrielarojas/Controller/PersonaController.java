package com.porfolio.gabrielarojas.Controller;

import com.porfolio.gabrielarojas.Service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.porfolio.gabrielarojas.Entity.Persona;

import java.util.List;

@RestController
public class PersonaController {
    @Autowired
    PersonaService personaService;

    @GetMapping("/personas/traer")
    public List<Persona> getPersona(){
        return personaService.getPersona();
    }
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody  Persona persona){
        personaService.savePersona(persona);
        return "Persona Creada";
    }
    @DeleteMapping("/persona/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        personaService.deletePersona(id);
        return "La persona fue eliminada";
    }
    @PutMapping("/personas/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
                              @RequestParam("nombre") String nuevoNombre,
                              @RequestParam("apellido") String nuevoApellido,
                              @RequestParam("imagenPortada") String nuevaImagen){

        Persona persona= personaService.findPersona(id);
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setImagenPortada(nuevaImagen);
        personaService.savePersona(persona);
        return persona;
    }

}
