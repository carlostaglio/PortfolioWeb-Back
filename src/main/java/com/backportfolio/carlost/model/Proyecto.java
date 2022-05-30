
package com.backportfolio.carlost.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyecto {
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
    @Size(min=1,max=150)
    private String urlProyecto;
    
    public Proyecto() {
    }

    public Proyecto(Long id, String nombre, String descripcion, String urlImagen, String urlProyecto) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.urlImagen = urlImagen;
        this.urlProyecto=urlProyecto;
    }
    
}
