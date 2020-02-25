package pl.edu.ug.hotel_backend.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    RoomType roomType;
    float area;
    Boolean free;
    Boolean bathroom;
    Boolean tv;
    Boolean balcony;
    Boolean safe;
    Boolean fridge;
    Boolean liquorCabinet;

}
