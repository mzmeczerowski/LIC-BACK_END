package pl.edu.ug.hotel.domain.person.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.ug.hotel.domain.person.entity.Person;
import pl.edu.ug.hotel.domain.person.service.iface.IPersonService;

import java.util.List;

@Service
public class PersonServiceImp implements IPersonService {

    IPersonRepository iPersonRepository;

    @Autowired
    PersonServiceImp(IPersonRepository iPersonRepository) {
        this.iPersonRepository = iPersonRepository;
    }


    @Override
    public Long save(Person person) {
        return iPersonRepository.save(person).getId();
    }

    @Override
    public Person getById(Long id) {
        return iPersonRepository.findById(id).get();
    }

    @Override
    public List<Person> getAll() {
        return iPersonRepository.findAll();
    }

    @Override
    public Person update(Long id, Person person) {
        person.setId(id);
        return iPersonRepository.save(person);
    }

    @Override
    public void deleteById(Long id) {
        iPersonRepository.deleteById(id);
    }

    @Override
    public void delete(Person person) {
        iPersonRepository.delete(person);
    }
}
