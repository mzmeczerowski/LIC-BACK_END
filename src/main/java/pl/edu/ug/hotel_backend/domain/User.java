package pl.edu.ug.hotel_backend.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class User extends Person{

private String login;
private String password;
}
