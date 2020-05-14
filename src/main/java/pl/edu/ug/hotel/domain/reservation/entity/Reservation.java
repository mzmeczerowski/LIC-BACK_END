package pl.edu.ug.hotel.domain.reservation.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import pl.edu.ug.hotel.domain.room.entity.Room;
import pl.edu.ug.hotel.domain.user.entity.User;

import javax.persistence.*;
import java.time.LocalDate;

@RequiredArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @NonNull
    LocalDate fromDate;
    @NonNull
    LocalDate toDate;
    @NonNull
    @ManyToOne(fetch = FetchType.LAZY)
    User user;
    @NonNull
    @ManyToOne(fetch = FetchType.LAZY)
    Room room;
    @NonNull
    Boolean actual;
    @NonNull
    Boolean paid;


}
