package pl.edu.ug.hotel.domain.director.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.ug.hotel.domain.director.entity.Director;

import java.util.List;

@Repository
public interface IDirectorRepository extends CrudRepository<Director, Long> {

    List<Director> findAll();
}
