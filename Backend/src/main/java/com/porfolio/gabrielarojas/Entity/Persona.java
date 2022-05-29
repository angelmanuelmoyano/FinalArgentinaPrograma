package com.porfolio.gabrielarojas.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min = 1, max = 50, message = "El campo contiene demasiado caracteres")
    private String nombre;
    @NotNull
    @Size(min = 1, max = 50, message = "El campo contiene demasiado caracteres")
    private String apellido;

    private String imagenPortada;

    private String logoPortada;

    private String email;

    private String password;

    private String acercade;

    private String facebook;

    private String instagram;

    private String linkedin;

    private String  twiter;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="fk_domicilio")
    private Domicilio domicilio;


    @OneToOne(mappedBy = "Roles_Persona")
    private Roles_Persona rolesPersona;

    @OneToMany(mappedBy = "Educacion")
    private List<Educacion> educacion;

    @OneToMany(mappedBy = "Experiencia")
    private List<Experiencia> experiencia;

    @OneToMany(mappedBy = "Habilidades")
    private List<Habilidades> habilidades;

    @OneToMany(mappedBy = "Proyectos")
    private List<Proyectos> proyectos;





}
