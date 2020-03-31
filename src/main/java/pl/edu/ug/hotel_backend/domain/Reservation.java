package pl.edu.ug.hotel_backend.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    LocalDate from;
    LocalDate to;
    @ManyToOne
    User user;
    @ManyToOne
    Room room;
    Boolean actual;
    Boolean paid;
}
