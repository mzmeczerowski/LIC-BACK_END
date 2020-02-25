package pl.edu.ug.hotel_backend.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String City;
    String zip;
    String streat;
    String number;
    int flaatNumber;
}
