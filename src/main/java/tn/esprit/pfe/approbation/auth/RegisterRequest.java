package tn.esprit.pfe.approbation.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;
import tn.esprit.pfe.approbation.entities.Role;
import tn.esprit.pfe.approbation.entities.User;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String role;
    private String avatar;
    private User manager;
}