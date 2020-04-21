package pl.edu.ug.hotel.domain.reservation.entity;

import lombok.Data;
import pl.edu.ug.hotel.domain.room.entity.Room;
import pl.edu.ug.hotel.domain.user.entity.User;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    LocalDate from;
    LocalDate to;
    @ManyToOne(fetch = FetchType.LAZY)
    User user;
    @ManyToOne(fetch = FetchType.LAZY)
    Room room;
    Boolean actual;
    Boolean paid;
}
