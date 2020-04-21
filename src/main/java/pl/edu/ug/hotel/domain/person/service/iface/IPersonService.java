package pl.edu.ug.hotel.domain.person.service.iface;

import pl.edu.ug.hotel.domain.person.entity.Person;

import java.util.List;

public interface IPersonService {

// CRUD

    // Create
    Long save(Person person);

    // Read
    Person getById(Long id);
    List<Person> getAll();

    //Update
    Person update(Long id, Person person);

    //Delete
    void deleteById(Long id);
    void delete(Person person);

}
