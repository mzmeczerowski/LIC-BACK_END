package pl.edu.ug.hotel.domain.hotel.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import pl.edu.ug.hotel.domain.room.entity.Room;
import pl.edu.ug.hotel.domain.address.entity.Address;
import pl.edu.ug.hotel.domain.director.entity.Director;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @NonNull
    String name;
    @NonNull
    String phoneNumber;
    @NonNull
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    Address address;
    @NonNull
    @OneToMany(fetch = FetchType.LAZY)
    List<Room> rooms;
    @NonNull
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    Director director;

}
