package pl.edu.ug.hotel.domain.person.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import pl.edu.ug.hotel.domain.address.entity.Address;

import javax.persistence.*;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @NonNull
    String firstName;
    @NonNull
    String lastName;
    @NonNull
    String phoneNumber;
    @NonNull
    @OneToOne(fetch = FetchType.EAGER)
    Address address;
}