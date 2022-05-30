package com.porfolio.gabrielarojas.Controller;

import com.porfolio.gabrielarojas.Entity.Habilidades;
import com.porfolio.gabrielarojas.Service.HabilidadesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HabilidadesController {
    @Autowired
    HabilidadesService habilidadesService;

    @GetMapping("/habilidades/traer")
    public List<Habilidades> getPersona(){
        return habilidadesService.getHabilidades();
    }
    @PostMapping("/habilidades/crear")
    public String createHabilidad(@RequestBody Habilidades habilidad){
        habilidadesService.savePersona(habilidad);
        return "Habilidad Creada";
    }
    @DeleteMapping("/habilidades/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        habilidadesService.deleteHabilidad(id);
        return "La Habilidad fue eliminada";
    }
    @PutMapping("/habilidades/editar/{id}")
    public Habilidades editHabilidad(@PathVariable Long id,
                               @RequestParam("nombre_habilidad") String nombre_habilidad,
                               @RequestParam("porcentaje_adquirido") String porcentaje_adquirido,
                               //@RequestParam("imagenPortada") String nuevaImagen){

        Persona persona= personaService.findPersona(id);
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setImagenPortada(nuevaImagen);
        personaService.savePersona(persona);
        return persona;
    }

}
