package pl.edu.ug.hotel.domain.receptionist.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.ug.hotel.domain.person.entity.Person;
import pl.edu.ug.hotel.domain.receptionist.entity.Receptionist;

import java.util.List;

@Repository
public interface IReceptionistRepository extends CrudRepository<Receptionist, Long> {

    List<Receptionist> findAll();
}
