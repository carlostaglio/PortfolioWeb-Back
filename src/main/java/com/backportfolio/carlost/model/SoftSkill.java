
package com.backportfolio.carlost.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class SoftSkill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @NotNull
    @Size(min=1,max=30)
    private String nombre;
    
    @NotNull
    @Max(100)
    @Min(0)
    private Long porcentaje;
    
    @NotNull
    @Size(min=1,max=150)
    private String urlImagen;
    
    public SoftSkill() {
    }

    public SoftSkill(Long id, String nombre, Long porcentaje, String urlImagen) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.urlImagen = urlImagen;
    }
    
    
}
