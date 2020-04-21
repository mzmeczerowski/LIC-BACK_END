package pl.edu.ug.hotel.domain.hotel.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.ug.hotel.domain.hotel.entity.Hotel;
import pl.edu.ug.hotel.domain.person.entity.Person;

import java.util.List;

@Repository
public interface IHotelRepository extends CrudRepository<Hotel, Long> {

    List<Hotel> findAll();
}
