package pl.edu.ug.hotel_backend.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class RoomType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String description;
    double PrisePerNight;


}
