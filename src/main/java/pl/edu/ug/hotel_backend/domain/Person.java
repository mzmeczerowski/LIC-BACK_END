package pl.edu.ug.hotel_backend.domain;

import lombok.Data;

        import javax.persistence.*;
        import java.util.List;

@Data
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String firstName;
    String lastName;
    String phoneNumber;
    @OneToOne(fetch = FetchType.EAGER)
    Address address;
}
