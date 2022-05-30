
package com.backportfolio.carlost.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Social {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Size(min=1,max=50)
    private String correo;
    
    @NotNull
    @Size(min=1,max=100)
    private String github;
    
    @NotNull
    @Size(min=1,max=100)
    private String linkedin;

    public Social() {
    }

    public Social(String correo, String github, String linkedin) {
        this.correo = correo;
        this.github = github;
        this.linkedin = linkedin;
    }
    
    
}
