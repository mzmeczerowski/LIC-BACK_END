package pl.edu.ug.hotel.domain.user.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import pl.edu.ug.hotel.domain.address.entity.Address;
import pl.edu.ug.hotel.domain.person.entity.Person;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class User extends Person {

    @NonNull
    private String login;
    @NonNull
    private String password;


    public User(@NonNull String firstName, @NonNull String lastName, @NonNull String phoneNumber, @NonNull Address address, @NonNull String login, @NonNull String password) {
        super(firstName, lastName, phoneNumber, address);
        this.login = login;
        this.password = password;
    }
}
