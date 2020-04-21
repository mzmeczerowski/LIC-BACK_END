package pl.edu.ug.hotel.domain.address.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @NonNull
    String City;
    @NonNull
    String zip;
    @NonNull
    String streat;
    @NonNull
    String number;
    @NonNull
    String flaatNumber;
}
