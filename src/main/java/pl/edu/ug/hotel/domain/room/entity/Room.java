package pl.edu.ug.hotel.domain.room.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import pl.edu.ug.hotel.domain.roomType.entity.RoomType;

import javax.persistence.*;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @NonNull
    @ManyToOne(fetch = FetchType.LAZY)
    RoomType roomType;
    @NonNull
    float area;
    @NonNull
    Boolean free;
    @NonNull
    Boolean bathroom;
    @NonNull
    Boolean tv;
    @NonNull
    Boolean balcony;
    @NonNull
    Boolean safe;
    @NonNull
    Boolean fridge;
    @NonNull
    Boolean liquorCabinet;

}
