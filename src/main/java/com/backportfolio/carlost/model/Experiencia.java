
package com.backportfolio.carlost.model;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @NotNull
    @Size(min=1,max=60)
    private String nombre;
    
    @NotNull
    @Size(min=1,max=250)
    private String descripcion;
    
    @NotNull
    @Size(min=1,max=150)
    private String urlImagen;
    
    @NotNull
    @Past
    private Date fechaInicio;
    
    @NotNull
    private Date fechaFin;
    
    public Experiencia() {
    }

    public Experiencia(Long id, String nombre, String descripcion, String urlImagen, Date fechaInicio, Date fechaFin) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.urlImagen = urlImagen;
        this.fechaInicio=fechaInicio;
        this.fechaFin=fechaFin;
    }
    
}
