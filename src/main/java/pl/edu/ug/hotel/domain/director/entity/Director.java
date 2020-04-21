package pl.edu.ug.hotel.domain.director.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import pl.edu.ug.hotel.domain.address.entity.Address;
import pl.edu.ug.hotel.domain.user.entity.User;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class Director extends User {

    public Director(@NonNull String firstName, @NonNull String lastName, @NonNull String phoneNumber, @NonNull Address address, @NonNull String login, @NonNull String password) {
        super(firstName, lastName, phoneNumber, address, login, password);
    }
}
