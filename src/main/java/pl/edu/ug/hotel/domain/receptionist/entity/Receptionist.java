package pl.edu.ug.hotel.domain.receptionist.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import pl.edu.ug.hotel.domain.address.entity.Address;
import pl.edu.ug.hotel.domain.user.entity.User;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class Receptionist extends User {

    @NonNull
    private double salary;

    public Receptionist(@NonNull String firstName, @NonNull String lastName, @NonNull String phoneNumber, @NonNull Address address, @NonNull String login, @NonNull String password, @NonNull double salary) {
        super(firstName, lastName, phoneNumber, address, login, password);
        this.salary = salary;
    }
}
