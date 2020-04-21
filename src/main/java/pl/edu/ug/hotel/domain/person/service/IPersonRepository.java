package pl.edu.ug.hotel.domain.person.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.ug.hotel.domain.person.entity.Person;

import java.util.List;

@Repository
public interface IPersonRepository extends CrudRepository<Person, Long> {

    List<Person> findAll();
}
