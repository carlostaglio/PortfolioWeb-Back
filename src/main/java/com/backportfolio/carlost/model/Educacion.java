
package com.backportfolio.carlost.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Educacion {
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
    @Min(1960)
    @Max(2050)
    private Long anioInicio;
    
    @NotNull
    @Min(1960)
    @Max(2050)
    private Long anioFin;
    
    public Educacion() {
    }

    public Educacion(Long id, String nombre, String descripcion, String urlImagen, Long anioInicio, Long anioFin) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.urlImagen = urlImagen;
        this.anioInicio=anioInicio;
        this.anioFin=anioFin;
    }
    
}
