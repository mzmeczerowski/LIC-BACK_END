package pl.edu.ug.hotel.domain.user.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import pl.edu.ug.hotel.domain.address.entity.Address;
import pl.edu.ug.hotel.domain.person.entity.Person;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class User extends Person {

    @NonNull
    @Column(nullable = false, unique = true)
    private String username;
    @NonNull
    private String password;


    public User(@NonNull String firstName, @NonNull String lastName, @NonNull String phoneNumber, @NonNull Address address, @NonNull String username, @NonNull String password) {
        super(firstName, lastName, phoneNumber, address);
        this.username = username;
        this.password = password;
    }
}
