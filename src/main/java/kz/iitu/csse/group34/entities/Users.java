package kz.iitu.csse.group34.entities;

import lombok.*;
import org.springframework.stereotype.Indexed;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Indexed
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "full_name")
    private String fullName;

    private Boolean isActive=true;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Roles> roles;

}
