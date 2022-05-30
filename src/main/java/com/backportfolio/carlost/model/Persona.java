
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
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @NotNull
    @Size(min=1,max=20)
    private String nombre;
    
    @NotNull
    @Size(min=1,max=20)
    private String apellido;
    
    @NotNull
    @Size(min=1,max=40)
    private String titulo;
    
    @NotNull
    @Size(min=1,max=250)
    private String sobreMi;
    
    @NotNull
    @Size(min=1,max=150)
    private String urlFoto;
   
    
    public Persona(){        
    }
    
    public Persona (Long id, String nombre, String apellido, String titulo, String sobreMi, String urlFoto) {
        this.id=id;
        this.nombre=nombre;
        this.apellido=apellido;
        this.titulo=titulo;
        this.sobreMi=sobreMi;
        this.urlFoto=urlFoto;
    }
}