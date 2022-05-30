
package com.backportfolio.carlost.security;

import javax.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter @Setter
public class AuthRequest {
    
    @Email
    @Length(min=1,max=50)
    private String email;
    @Length(min=1,max=50)
    private String password;
    
    
    
}
