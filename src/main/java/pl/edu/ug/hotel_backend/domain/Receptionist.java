package pl.edu.ug.hotel_backend.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Receptionist extends User{
    double salary;
}
