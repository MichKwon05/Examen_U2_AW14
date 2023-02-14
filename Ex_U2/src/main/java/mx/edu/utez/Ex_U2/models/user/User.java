package mx.edu.utez.Ex_U2.models.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "user")
@NoArgsConstructor
@Setter
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUser;

    @Column(nullable = false, length = 50)
    private String nameUser;

    @Column(nullable = false, length = 60)
    private String emailUser;

    @Column(nullable = false, length = 50)
    private String passwordUser;

    @Column(nullable = false, length = 60)
    private String listWish;

    ///transaccion idUser
    public User(long idUser, String nameUser, String emailUser, String passwordUser, String listWish) {
        this.idUser = idUser;
        this.nameUser = nameUser;
        this.emailUser = emailUser;
        this.passwordUser = passwordUser;
        this.listWish = listWish;
    }
}

/*ID del usuario (entero, clave primaria)
Nombre completo (texto)
Correo electrónico (texto)
Contraseña (texto)
Lista de deseos (texto)
*/