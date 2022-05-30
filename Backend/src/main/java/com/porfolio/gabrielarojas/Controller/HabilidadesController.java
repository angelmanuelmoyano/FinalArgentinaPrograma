package com.porfolio.gabrielarojas.Controller;

import com.porfolio.gabrielarojas.Entity.Habilidades;
import com.porfolio.gabrielarojas.Interface.IHabilidadesService;
import com.porfolio.gabrielarojas.Service.HabilidadesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HabilidadesController {
    @Autowired
    HabilidadesService habilidadesService;

    @GetMapping("/habilidades/traer")
    public List<Habilidades> getHabilidades(){
        return habilidadesService.getHabilidades();
    }
    @PostMapping("/habilidades/crear")
    public String createHabilidad(@RequestBody Habilidades habilidad){
        habilidadesService.saveHabilidad(habilidad);
        return "Habilidad Creada";
    }
    @DeleteMapping("/habilidades/borrar/{id}")
    public String deleteHabilidad(@PathVariable Long id){
        habilidadesService.deleteHabilidad(id);
        return "La Habilidad fue eliminada";
    }
    @PutMapping("/habilidades/editar/{id}")
    public Habilidades editHabilidad(@PathVariable Long id,
                               @RequestParam("nombre_habilidad") String nombre_habilidad,
                               @RequestParam("porcentaje_adquirido") int porcentaje_adquirido){//,
                               //@RequestParam("imagenPortada") String nuevaImagen){

        Habilidades habilidad= habilidadesService.findHabilidad(id);
        habilidad.setNombreHabilidad(nombre_habilidad);
        habilidad.setPorcentajeAdquirido(porcentaje_adquirido);
        habilidadesService.saveHabilidad(habilidad);
        return habilidad;
    }

}
