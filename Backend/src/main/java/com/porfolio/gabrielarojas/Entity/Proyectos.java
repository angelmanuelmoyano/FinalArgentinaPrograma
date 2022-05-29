package com.porfolio.gabrielarojas.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Proyectos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreProyecto;
    private Date fechaRealizacion;
    private String link;
    private String linkRepositorio;
    private String descripcion;
    private String imagen1;
    private String imagen2;
    private String imagen3;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_persona", nullable = false)
    private Persona persona;


}
